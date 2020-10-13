import tester.Tester;
import javalib.worldimages.*;   // images, like RectangleImage or OverlayImages
import java.awt.Color; 

interface IMobile {
  // to calculate the weight of this IMobile
  int totalWeight();
  
  // to calculate the height of this IMobile
  int totalHeight();
  
  // checks if the mobile is balanced with respect to torque
  boolean isBalanced();
  
  // helps check if this mobile is balanced
  int isBalancedHelper(int offset);
  
  // combines this balanced mobile with the given balanced mobile
  IMobile buildMobile(IMobile mobile, int length, int width);
  
  // computes the current width of this mobile
  int curWidth();
  
  // helps compute the current width of this mobile
  int curWidthHelper(int offset, boolean isLeft);
  
  // draws this mobile
  WorldImage drawMobile();
  
  // helps draw this mobile by recursively drawing and mobiles contained by this one
  WorldImage drawMobileHelp(WorldImage imgSoFar);
  
  int LINE_SCALE = 10;
  int SHAPE_SCALE = 10;
}

class Simple implements IMobile {
  int length;
  int weight;
  Color color;
  
  Simple(int length, int weight, Color color) {
    this.length = length;
    this.weight = weight;
    this.color = color;
  }
  
  /* fields:
   * ... this.length ...      -- int
   * ... this.weight ...      -- int
   * ... this.color ...       -- Color
   * methods:
   * ... this.totalWeight() ...               -- int
   * ... this.totalHeight() ...               -- int
   * ... this.isBalanced() ...                -- boolean
   * ... this.isBalancedHelper(int) ...       -- int
   * ... this.buildMobile(IMobile, int, int)  -- IMobile
   * ... this.curWidth() ...                  -- int
   * ... this.curWidthHelper(int, boolean)    -- int
   * ... this.drawMobile() ...                -- WorldImage
   * ... this.drawMobileHelper(WorldImage)    -- WorldImage
   * methods for fields:
   * 
   * */
  
  // to calculate the weight of this IMobile
  @Override
  public int totalWeight() {
    /* TEMPLATE: everything in the template for Simple */
    return this.weight;
  }
  
  // to calculate the height of this IMobile
  @Override
  public int totalHeight() {
    /* TEMPLATE: everything in the template for Simple */
    return this.weight / 10 + this.length;
  }
  
  // checks if the mobile is balanced with respect to torque
  @Override
  public boolean isBalanced() {
    /* TEMPLATE: everything in the template for Simple */
    return true;
  }
  
  //helps check if this mobile is balanced
  @Override
  public int isBalancedHelper(int offset) {
    /* TEMPLATE: everything in the template for Simple */
    return this.weight * offset;
  }
  
  //combines this balanced mobile with the given balanced mobile
  @Override
  public IMobile buildMobile(IMobile mobile, int length, int width) {
    /* TEMPLATE: everything in the template for Simple plus
     * methods on parameters:
     * ... mobile.totalWeight() ...               -- int
     * ... mobile.totalHeight() ...               -- int
     * ... mobile.isBalanced() ...                -- boolean
     * ... mobile.isBalancedHelper(int) ...       -- int
     * ... mobile.buildMobile(IMobile, int, int)  -- IMobile
     * ... mobile.curWidth() ...                  -- int
     * ... mobile.curWidthHelper(int, boolean)    -- int
     * ... mobile.drawMobile() ...                -- WorldImage
     * ... mobile.drawMobileHelper(WorldImage)    -- WorldImage*/
    int weightRight = mobile.totalWeight();
    int leftside = width * weightRight / (this.weight + weightRight);
    return new Complex(length, leftside, width - leftside, this, mobile);
  }
  
  //computes the current width of this mobile
  @Override
  public int curWidth() {
    /* TEMPLATE: everything in the template for Simple */
    return this.weight % 10 == 0 ? 
        this.weight / 10 : 
          1 + this.weight / 10;
  }
  
  //helps compute the current width of this mobile
  @Override
  public int curWidthHelper(int offset, boolean isLeft) {
    /* TEMPLATE: everything in the template for Simple */
    int width = this.curWidth();
    return width % 2 == 0 ?
        offset + width / 2 : 
          offset + 1 + width / 2;
  }
  
  //draws this mobile
  @Override
  public WorldImage drawMobile() {
    /* TEMPLATE: everything in the template for Simple */
    WorldImage string = new LineImage(new Posn(0, this.length * IMobile.LINE_SCALE),
        Color.gray);
    WorldImage shape = new RectangleImage(this.curWidth() * IMobile.SHAPE_SCALE, 
        this.weight / 10 * IMobile.SHAPE_SCALE,  
        OutlineMode.SOLID, this.color);
    
    WorldImage shapeOnString = new OverlayOffsetImage(
        shape.movePinhole(0, -1 * (this.weight / 10) * IMobile.SHAPE_SCALE / 2), 
        0, 0, string.movePinhole(0, this.length * IMobile.LINE_SCALE / 2));
    return new AboveImage(shapeOnString,
        new TextImage(Integer.toString(this.weight), Color.black));
  }

  //does nothing in base case, should never be called
  @Override
  public WorldImage drawMobileHelp(WorldImage imgSoFar) {
    /* TEMPLATE: everything in the template for Simple */
    return null;
  }
  
}

class Complex implements IMobile {
  int length;
  int leftside;
  int rightside;
  IMobile left;
  IMobile right;
  
  Complex(int length, int leftside, int rightside, IMobile left, IMobile right) {
    this.length = length;
    this.leftside = leftside;
    this.rightside = rightside;
    this.left = left;
    this.right = right;
  }

  /* fields:
   * ... this.length ...      -- int
   * ... this.weight ...      -- int
   * ... this.color ...       -- Color
   * methods:
   * ... this.totalWeight() ...               -- int
   * ... this.totalHeight() ...               -- int
   * ... this.isBalanced() ...                -- boolean
   * ... this.isBalancedHelper(int) ...       -- int
   * ... this.buildMobile(IMobile, int, int)  -- IMobile
   * ... this.curWidth() ...                  -- int
   * ... this.curWidthHelper(int, boolean)    -- int
   * ... this.drawMobile() ...                -- WorldImage
   * ... this.drawMobileHelper(WorldImage)    -- WorldImage
   * methods for fields:
   * all methods in this template for this.left and this.right
   * 
   * */
  
  // to calculate the weight of this IMobile
  @Override
  public int totalWeight() {
    /* TEMPLATE: everything in the template for Complex */
    return this.left.totalWeight() + this.right.totalWeight();
  }
  
  // to calculate the height of this IMobile
  @Override
  public int totalHeight() {
    /* TEMPLATE: everything in the template for Complex */
    return Math.max(this.left.totalHeight(), this.right.totalHeight()) + this.length;
  }
  
  // checks if the mobile is balanced with respect to torque
  @Override
  public boolean isBalanced() {
    /* TEMPLATE: everything in the template for Complex */
    if (this.left.isBalanced() && this.right.isBalanced()) {
      return this.left.isBalancedHelper(this.leftside) == 
          this.right.isBalancedHelper(this.rightside);
    }
    else {
      return false;
    }
    
  }
    
  //helps check if this mobile is balanced
  @Override
  public int isBalancedHelper(int offset) {
    /* TEMPLATE: everything in the template for Complex */
    return (this.right.totalWeight() + this.left.totalWeight()) * offset;
  }
  
  //combines this balanced mobile with the given balanced mobile
  @Override
  public IMobile buildMobile(IMobile mobile, int length, int width) {
    /* TEMPLATE: everything in the template for Simple plus
     * methods on parameters:
     * ... mobile.totalWeight() ...               -- int
     * ... mobile.totalHeight() ...               -- int
     * ... mobile.isBalanced() ...                -- boolean
     * ... mobile.isBalancedHelper(int) ...       -- int
     * ... mobile.buildMobile(IMobile, int, int)  -- IMobile
     * ... mobile.curWidth() ...                  -- int
     * ... mobile.curWidthHelper(int, boolean)    -- int
     * ... mobile.drawMobile() ...                -- WorldImage
     * ... mobile.drawMobileHelper(WorldImage)    -- WorldImage*/
    int weightRight = mobile.totalWeight();
    int leftside = width * weightRight / (this.totalWeight() + weightRight);
    return new Complex(length, leftside, width - leftside, this, mobile);
  }
  
  //computes the current width of this mobile
  @Override
  public int curWidth() {
    /* TEMPLATE: everything in the template for Complex */
    return this.left.curWidthHelper(this.leftside, true) + 
        this.right.curWidthHelper(this.rightside, false);
  }
  
  //helps compute the current width of this mobile
  @Override
  public int curWidthHelper(int offset, boolean isLeft) {
    /* TEMPLATE: everything in the template for Complex */
    if (isLeft) {
      return Math.max(
          this.left.curWidthHelper(offset + this.leftside, true), 
          this.right.curWidthHelper(offset - this.rightside, false));
    }
    else {
      return Math.max(
          this.right.curWidthHelper(offset + this.rightside, false), 
          this.left.curWidthHelper(offset - this.leftside, true));
    }
  }

  //draws this mobile
  @Override
  public WorldImage drawMobile() {
    /* TEMPLATE: everything in the template for Complex */
    int strutCenter = (this.leftside + this.rightside) / 2;
    WorldImage string = new LineImage(new Posn(0, this.length * IMobile.LINE_SCALE),
        Color.gray);
    WorldImage strut = new LineImage(
        new Posn((this.leftside + this.rightside) * IMobile.LINE_SCALE, 0), 
        Color.gray);
    WorldImage imgSoFar = new OverlayOffsetImage(
        strut.movePinholeTo(new Posn(Math.abs(this.leftside - strutCenter) * IMobile.LINE_SCALE, 
            0)), 
        0, 0, string.movePinholeTo(new Posn(0, this.length * IMobile.LINE_SCALE / 2)));
    
    return this.drawMobileHelp(imgSoFar);
  }
  
  //helps draw this mobile by recursively drawing and mobiles contained by this one
  @Override
  public WorldImage drawMobileHelp(WorldImage imgSoFar) {
    /* TEMPLATE: everything in the template for Complex */
    WorldImage leftImage = this.left.drawMobile().movePinholeTo(new Posn(0, 0));
    WorldImage rightImage = this.right.drawMobile().movePinholeTo(new Posn(0, 0));
    imgSoFar =  new OverlayOffsetImage(
        leftImage.movePinhole(0, -1 * this.left.totalHeight() * IMobile.SHAPE_SCALE / 2), 
        0, 0,
        imgSoFar.movePinhole(-1 * this.leftside * IMobile.LINE_SCALE, 0));
    return new OverlayOffsetImage(
        rightImage.movePinhole(0, -1 * this.right.totalHeight() * IMobile.LINE_SCALE / 2),
        0, 0,
        imgSoFar.movePinhole((this.rightside + this.leftside) * IMobile.LINE_SCALE, 0));
  }
  
}

class ExamplesMobiles {
  IMobile exampleSimple = new Simple(2, 20, Color.blue);
  IMobile simple2 = new Simple(1, 36, Color.blue);
  IMobile simple3 = new Simple(1, 12, Color.red);
  IMobile simple4 = new Simple(2, 36, Color.red);
  IMobile simple5 = new Simple(1, 60, Color.green);
  IMobile exampleComplex = new Complex(1, 9, 3, this.simple2, 
      new Complex(2, 8, 1, this.simple3,
          new Complex(2, 5, 3, this.simple4, this.simple5)));
  
  IMobile simple6 = new Simple(1, 50, Color.blue);
  IMobile simple7 = new Simple(2, 30, Color.green);
  IMobile example3 = new Complex(1, 2, 3, this.simple6, this.simple7);
  
  boolean testIsBalanced(Tester t) {
    return t.checkExpect(this.exampleComplex.isBalanced(), true);
  }
  
  boolean testBuildMobile(Tester t) {
    return t.checkExpect(this.exampleSimple.buildMobile(this.simple5, 1, 8), 
        new Complex(1, 6, 2, this.exampleSimple, this.simple5))
        && t.checkExpect(this.simple2.buildMobile(this.simple3, 1, 4), 
            new Complex(1, 1, 3, this.simple2, this.simple3))
        && t.checkExpect(this.exampleComplex.buildMobile(this.simple2, 2, 5),
            new Complex(2, 1, 4, this.exampleComplex, this.simple2));
  }
  
  boolean testCurWidth(Tester t) {
    return t.checkExpect(this.exampleSimple.curWidth(), 2)
        && t.checkExpect(this.exampleComplex.curWidth(), 21);
  }
 
  boolean testIsBalancedHelper(Tester t) {
    return t.checkExpect(this.exampleSimple.isBalancedHelper(0), 0)
        && t.checkExpect(exampleComplex.isBalancedHelper(1), 144);
  }
}