import tester.*;

// An interface to represent a picture
interface IPicture {
  // gets the width of all shapes in a picture
  int getWidth();
  
  // gets the number of shapes in a picture
  int countShapes();
  
  // gets the depth of operation in a picture
  int comboDepth();
  
  // mirrors all Beside operations in a picture
  IPicture mirror();
  
  // returns a string representation of a picture
  String pictureRecipe(int depth);
}

// An interface to represent an Operation
interface IOperation {
  // gets the width of a picture in an operation
  int getWidth();
  
  // counts the shapes contained within an operation
  int countShapes();
  
  // gets the depth of operations nested in an operation
  int comboDepth();
  
  // mirrors all beside objects in an operation
  IOperation mirror();
  
  // returns a string based representation of an operation
  String pictureRecipe(int depth);
}


// to represent a Scale operation
class Scale implements IOperation {
  IPicture picture;
  
  Scale(IPicture picture) {
    this.picture = picture;
  }
  
  /* fields: 
   *  this.picture ... IPicture
   * methods:
   *  this.getWidth() ... int
   *  this.countShapes() ... int
   *  this.comboDepth() ... int
   *  this.mirror() ... IOperation
   *  this.pictureRecipe(int) ... String
   * methods for fields:
   *  this.picture.getWidth() ... int
   *  this.picture.countShapes() ... int
   *  this.picture.comboDepth() ... int
   *  this.picture.mirror() ... IPicture
   *  this.picture.pictureRecipe(int) ... String
   */

  // gets the scaled width of all pictures in the operation
  @Override
  public int getWidth() {
    /* Template:
     * Fields:
     *  this.picture -- IPicture
     * Methods:
     *  this.getWidth() -- int
     *  this.countShapes() -- int
     *  this.comboDepth() -- int
     *  this.mirror() -- IOperation
     *  this.pictureRecipe(int) -- String  
     * Methods for fields:
     *  this.picture.getWidth() -- int
     *  this.picture.countShapes() -- int
     *  this.picture.comboDepth() -- int
     *  this.picture.mirror() -- IPicture
     *  this.picture.pictureRecipe(int) -- String
     */
    return this.picture.getWidth() * 2;
  }

  // counts all shapes in the operation
  @Override
  public int countShapes() {
    /* Template:
     * Fields:
     *  this.picture -- IPicture
     * Methods:
     *  this.getWidth() -- int
     *  this.countShapes() -- int
     *  this.comboDepth() -- int
     *  this.mirror() -- IOperation
     *  this.pictureRecipe(int) -- String  
     * Methods for fields:
     *  this.picture.getWidth() -- int
     *  this.picture.countShapes() -- int
     *  this.picture.comboDepth() -- int
     *  this.picture.mirror() -- IPicture
     *  this.picture.pictureRecipe(int) -- String
     */
    return this.picture.countShapes();
  }

  // counts the depth of operations contained in picture, including this operation
  @Override
  public int comboDepth() {
    /* Template:
     * Fields:
     *  this.picture -- IPicture
     * Methods:
     *  this.getWidth() -- int
     *  this.countShapes() -- int
     *  this.comboDepth() -- int
     *  this.mirror() -- IOperation
     *  this.pictureRecipe(int) -- String  
     * Methods for fields:
     *  this.picture.getWidth() -- int
     *  this.picture.countShapes() -- int
     *  this.picture.comboDepth() -- int
     *  this.picture.mirror() -- IPicture
     *  this.picture.pictureRecipe(int) -- String
     */
    return 1 + this.picture.comboDepth();
  }

  // mirrors all beside operations contained in this.picture
  @Override
  public IOperation mirror() {
    /* Template:
     * Fields:
     *  this.picture -- IPicture
     * Methods:
     *  this.getWidth() -- int
     *  this.countShapes() -- int
     *  this.comboDepth() -- int
     *  this.mirror() -- IOperation
     *  this.pictureRecipe(int) -- String  
     * Methods for fields:
     *  this.picture.getWidth() -- int
     *  this.picture.countShapes() -- int
     *  this.picture.comboDepth() -- int
     *  this.picture.mirror() -- IPicture
     *  this.picture.pictureRecipe(int) -- String
     */
    return new Scale(this.picture.mirror());
  }

  // returns a string representation this operation and all suboperations at the given depth
  @Override
  public String pictureRecipe(int depth) {
    /* Template:
     * Fields:
     *  this.picture -- IPicture
     * Methods:
     *  this.getWidth() -- int
     *  this.countShapes() -- int
     *  this.comboDepth() -- int
     *  this.mirror() -- IOperation
     *  this.pictureRecipe(int) -- String  
     * Methods for fields:
     *  this.picture.getWidth() -- int
     *  this.picture.countShapes() -- int
     *  this.picture.comboDepth() -- int
     *  this.picture.mirror() -- IPicture
     *  this.picture.pictureRecipe(int) -- String
     */
    return "scale(" + this.picture.pictureRecipe(depth) + ")";
  }
  
 
}

// to represent a Beside operation
class Beside implements IOperation {
  IPicture picture1;
  IPicture picture2;
  
  Beside(IPicture left, IPicture right) {
    this.picture1 = left;
    this.picture2 = right;
  }
  /* fields: 
   *  this.picture1 ... IPicture
   *  this.picture2 ... IPicture
   * methods:
   *  this.getWidth() ... int
   *  this.countShapes() ... int
   *  this.comboDepth() ... int
   *  this.mirror() ... IOperation
   *  this.pictureRecipe(int) ... String
   * methods for fields:
   *  this.picture1.getWidth() ... int
   *  this.picture2.getWidth() ... int
   *  this.picture1.countShapes() ... int
   *  this.picture2.countShapes() ... int
   *  this.picture1.comboDepth() ... int
   *  this.picture2.comboDepth() ... int
   *  this.picture1.mirror() ... IPicture
   *  this.picture2.mirror() ... IPicture
   *  this.picture1.pictureRecipe(int) ... String
   *  this.picture2.pictureRecipe(int) ... String
   */
  
  // gets the width of all shapes contained in this.picture1 and this.picture2
  @Override
  public int getWidth() {
    /* Template:
     * fields: 
     *  this.picture1 ... IPicture
     *  this.picture2 ... IPicture
     * methods:
     *  this.getWidth() ... int
     *  this.countShapes() ... int
     *  this.comboDepth() ... int
     *  this.mirror() ... IOperation
     *  this.pictureRecipe(int) ... String
     * methods for fields:
     *  this.picture1.getWidth() ... int
     *  this.picture2.getWidth() ... int
     *  this.picture1.countShapes() ... int
     *  this.picture2.countShapes() ... int
     *  this.picture1.comboDepth() ... int
     *  this.picture2.comboDepth() ... int
     *  this.picture1.mirror() ... IPicture
     *  this.picture2.mirror() ... IPicture
     *  this.picture1.pictureRecipe(int) ... String
     *  this.picture2.pictureRecipe(int) ... String
     */
    return this.picture1.getWidth() + this.picture2.getWidth();
  }

  // counts all shapes contained in this.picture1 and this.picture2
  @Override
  public int countShapes() {
    /* Template:
     * fields: 
     *  this.picture1 ... IPicture
     *  this.picture2 ... IPicture
     * methods:
     *  this.getWidth() ... int
     *  this.countShapes() ... int
     *  this.comboDepth() ... int
     *  this.mirror() ... IOperation
     *  this.pictureRecipe(int) ... String
     * methods for fields:
     *  this.picture1.getWidth() ... int
     *  this.picture2.getWidth() ... int
     *  this.picture1.countShapes() ... int
     *  this.picture2.countShapes() ... int
     *  this.picture1.comboDepth() ... int
     *  this.picture2.comboDepth() ... int
     *  this.picture1.mirror() ... IPicture
     *  this.picture2.mirror() ... IPicture
     *  this.picture1.pictureRecipe(int) ... String
     *  this.picture2.pictureRecipe(int) ... String
     */
    return this.picture1.countShapes() + this.picture2.countShapes();
  }

  // returns the depth of operations in both pictures, including this operation
  @Override
  public int comboDepth() {
    /* Template:
     * fields: 
     *  this.picture1 ... IPicture
     *  this.picture2 ... IPicture
     * methods:
     *  this.getWidth() ... int
     *  this.countShapes() ... int
     *  this.comboDepth() ... int
     *  this.mirror() ... IOperation
     *  this.pictureRecipe(int) ... String
     * methods for fields:
     *  this.picture1.getWidth() ... int
     *  this.picture2.getWidth() ... int
     *  this.picture1.countShapes() ... int
     *  this.picture2.countShapes() ... int
     *  this.picture1.comboDepth() ... int
     *  this.picture2.comboDepth() ... int
     *  this.picture1.mirror() ... IPicture
     *  this.picture2.mirror() ... IPicture
     *  this.picture1.pictureRecipe(int) ... String
     *  this.picture2.pictureRecipe(int) ... String
     */
    return Math.max(this.picture1.comboDepth(), this.picture2.comboDepth()) + 1;
  }

  // mirrors the pictures contained in this Beside operation and all suboperations 
  @Override
  public IOperation mirror() {
    /* Template:
     * fields: 
     *  this.picture1 ... IPicture
     *  this.picture2 ... IPicture
     * methods:
     *  this.getWidth() ... int
     *  this.countShapes() ... int
     *  this.comboDepth() ... int
     *  this.mirror() ... IOperation
     *  this.pictureRecipe(int) ... String
     * methods for fields:
     *  this.picture1.getWidth() ... int
     *  this.picture2.getWidth() ... int
     *  this.picture1.countShapes() ... int
     *  this.picture2.countShapes() ... int
     *  this.picture1.comboDepth() ... int
     *  this.picture2.comboDepth() ... int
     *  this.picture1.mirror() ... IPicture
     *  this.picture2.mirror() ... IPicture
     *  this.picture1.pictureRecipe(int) ... String
     *  this.picture2.pictureRecipe(int) ... String
     */
    return new Beside(this.picture2.mirror(), this.picture1.mirror());
  }

  // returns a string representation of this operation and all subpoperations at the given depth
  @Override
  public String pictureRecipe(int depth) {
    /* Template:
     * fields: 
     *  this.picture1 ... IPicture
     *  this.picture2 ... IPicture
     * methods:
     *  this.getWidth() ... int
     *  this.countShapes() ... int
     *  this.comboDepth() ... int
     *  this.mirror() ... IOperation
     *  this.pictureRecipe(int) ... String
     * methods for fields:
     *  this.picture1.getWidth() ... int
     *  this.picture2.getWidth() ... int
     *  this.picture1.countShapes() ... int
     *  this.picture2.countShapes() ... int
     *  this.picture1.comboDepth() ... int
     *  this.picture2.comboDepth() ... int
     *  this.picture1.mirror() ... IPicture
     *  this.picture2.mirror() ... IPicture
     *  this.picture1.pictureRecipe(int) ... String
     *  this.picture2.pictureRecipe(int) ... String
     */
    return "beside(" + this.picture1.pictureRecipe(depth) + 
        ", " + this.picture2.pictureRecipe(depth) + ")";
  }

}

// to represent an Overlay operation
class Overlay implements IOperation {
  IPicture topPicture;
  IPicture bottomPicture;
  
  Overlay(IPicture top, IPicture bottom) {
    this.topPicture = top;
    this.bottomPicture = bottom;
  }

  /* fields: 
   *  this.topPicture ... IPicture
   *  this.bottomPicture ... IPicture
   * methods:
   *  this.getWidth() ... int
   *  this.countShapes() ... int
   *  this.comboDepth() ... int
   *  this.mirror() ... IOperation
   *  this.pictureRecipe(int) ... String
   * methods for fields:
   *  this.topPicture.getWidth() ... int
   *  this.bottomPicture.getWidth() ... int
   *  this.topPicture.countShapes() ... int
   *  this.bottomPicture.countShapes() ... int
   *  this.topPicture.comboDepth() ... int
   *  this.bottomPicture.comboDepth() ... int
   *  this.topPicture.mirror() ... IPicture
   *  this.bottomPicture.mirror() ... IPicture
   *  this.topPicture.pictureRecipe(int) ... String
   *  this.bottomPicture.pictureRecipe(int) ... String
   */
  
  // gets the width of all pictures contained in this operation
  @Override
  public int getWidth() {
    /* Template:
     * fields: 
     *  this.topPicture ... IPicture
     *  this.bottomPicture ... IPicture
     * methods:
     *  this.getWidth() ... int
     *  this.countShapes() ... int
     *  this.comboDepth() ... int
     *  this.mirror() ... IOperation
     *  this.pictureRecipe(int) ... String
     * methods for fields:
     *  this.topPicture.getWidth() ... int
     *  this.bottomPicture.getWidth() ... int
     *  this.topPicture.countShapes() ... int
     *  this.bottomPicture.countShapes() ... int
     *  this.topPicture.comboDepth() ... int
     *  this.bottomPicture.comboDepth() ... int
     *  this.topPicture.mirror() ... IPicture
     *  this.bottomPicture.mirror() ... IPicture
     *  this.topPicture.pictureRecipe(int) ... String
     *  this.bottomPicture.pictureRecipe(int) ... String
     */
    return Math.max(this.topPicture.getWidth(), this.bottomPicture.getWidth());
  }

  // counts all shapes contained in this operation
  @Override
  public int countShapes() {
    /* Template:
     * fields: 
     *  this.topPicture ... IPicture
     *  this.bottomPicture ... IPicture
     * methods:
     *  this.getWidth() ... int
     *  this.countShapes() ... int
     *  this.comboDepth() ... int
     *  this.mirror() ... IOperation
     *  this.pictureRecipe(int) ... String
     * methods for fields:
     *  this.topPicture.getWidth() ... int
     *  this.bottomPicture.getWidth() ... int
     *  this.topPicture.countShapes() ... int
     *  this.bottomPicture.countShapes() ... int
     *  this.topPicture.comboDepth() ... int
     *  this.bottomPicture.comboDepth() ... int
     *  this.topPicture.mirror() ... IPicture
     *  this.bottomPicture.mirror() ... IPicture
     *  this.topPicture.pictureRecipe(int) ... String
     *  this.bottomPicture.pictureRecipe(int) ... String
     */
    return this.topPicture.countShapes() + this.bottomPicture.countShapes();
  }

  // returns the depth of all operations in this.topPicture and this.bottomPicture, 
  // plus this operation
  @Override
  public int comboDepth() {
    /* Template:
     * fields: 
     *  this.topPicture ... IPicture
     *  this.bottomPicture ... IPicture
     * methods:
     *  this.getWidth() ... int
     *  this.countShapes() ... int
     *  this.comboDepth() ... int
     *  this.mirror() ... IOperation
     *  this.pictureRecipe(int) ... String
     * methods for fields:
     *  this.topPicture.getWidth() ... int
     *  this.bottomPicture.getWidth() ... int
     *  this.topPicture.countShapes() ... int
     *  this.bottomPicture.countShapes() ... int
     *  this.topPicture.comboDepth() ... int
     *  this.bottomPicture.comboDepth() ... int
     *  this.topPicture.mirror() ... IPicture
     *  this.bottomPicture.mirror() ... IPicture
     *  this.topPicture.pictureRecipe(int) ... String
     *  this.bottomPicture.pictureRecipe(int) ... String
     */
    return Math.max(this.topPicture.comboDepth(), this.bottomPicture.comboDepth()) + 1;
  }
  
  
  // mirrors all Beside operations contained in this.topPicture and this.bottomPicture
  @Override
  public IOperation mirror() {
    /* Template:
     * fields: 
     *  this.topPicture ... IPicture
     *  this.bottomPicture ... IPicture
     * methods:
     *  this.getWidth() ... int
     *  this.countShapes() ... int
     *  this.comboDepth() ... int
     *  this.mirror() ... IOperation
     *  this.pictureRecipe(int) ... String
     * methods for fields:
     *  this.topPicture.getWidth() ... int
     *  this.bottomPicture.getWidth() ... int
     *  this.topPicture.countShapes() ... int
     *  this.bottomPicture.countShapes() ... int
     *  this.topPicture.comboDepth() ... int
     *  this.bottomPicture.comboDepth() ... int
     *  this.topPicture.mirror() ... IPicture
     *  this.bottomPicture.mirror() ... IPicture
     *  this.topPicture.pictureRecipe(int) ... String
     *  this.bottomPicture.pictureRecipe(int) ... String
     */
    return new Overlay(this.topPicture.mirror(), this.bottomPicture.mirror());
  }

  // returns a string representation of this operation and all suboperations at the given depth
  @Override
  public String pictureRecipe(int depth) {
    /* Template:
     * fields: 
     *  this.topPicture ... IPicture
     *  this.bottomPicture ... IPicture
     * methods:
     *  this.getWidth() ... int
     *  this.countShapes() ... int
     *  this.comboDepth() ... int
     *  this.mirror() ... IOperation
     *  this.pictureRecipe(int) ... String
     * methods for fields:
     *  this.topPicture.getWidth() ... int
     *  this.bottomPicture.getWidth() ... int
     *  this.topPicture.countShapes() ... int
     *  this.bottomPicture.countShapes() ... int
     *  this.topPicture.comboDepth() ... int
     *  this.bottomPicture.comboDepth() ... int
     *  this.topPicture.mirror() ... IPicture
     *  this.bottomPicture.mirror() ... IPicture
     *  this.topPicture.pictureRecipe(int) ... String
     *  this.bottomPicture.pictureRecipe(int) ... String
     */
    return "overlay(" + this.topPicture.pictureRecipe(depth) + 
        ", " + this.bottomPicture.pictureRecipe(depth) + ")";
  }

}

// to represent a Shape
class Shape implements IPicture {
  String kind;
  int size;
  
  /* fields: 
   *  this.kind ... String
   *  this.size ... int
   * methods:
   *  this.getWidth() ... int
   * methods for fields:
   */
  Shape(String kind, int size) {
    this.kind = kind;
    this.size = size;
  }


  // gets the width of the picture
  @Override
  public int getWidth() {
    /* Template:
     * fields: 
     *  this.kind ... String
     *  this.size ... int
     * methods:
     *  this.getWidth() ... int
     * methods for fields:
     */
    return this.size;
  }

  // returns 1, base case for counting a shape
  @Override
  public int countShapes() {
    /* Template:
     * fields: 
     *  this.kind ... String
     *  this.size ... int
     * methods:
     *  this.getWidth() ... int
     * methods for fields:
     */
    return 1;
  }

  // returns 0, base case for counting combos (a shape does not count towards combo depth)
  @Override
  public int comboDepth() {
    /* Template:
     * fields: 
     *  this.kind ... String
     *  this.size ... int
     * methods:
     *  this.getWidth() ... int
     * methods for fields:
     */
    return 0;
  }

  // base case for mirror, just returns the same shape
  @Override
  public IPicture mirror() {
    /* Template:
     * fields: 
     *  this.kind ... String
     *  this.size ... int
     * methods:
     *  this.getWidth() ... int
     * methods for fields:
     */
    return this;
  }

  // returns the kind of shape to represent as string
  @Override
  public String pictureRecipe(int depth) {
    /* Template:
     * fields: 
     *  this.kind ... String
     *  this.size ... int
     * methods:
     *  this.getWidth() ... int
     * methods for fields:
     */
    return this.kind;
  }
  
}

// to represent a Combo
class Combo implements IPicture {
  String name;
  IOperation operation;
  
  Combo(String name, IOperation operation) {
    this.name = name;
    this.operation = operation;
  }
  
  /* fields:
   *  this.name ... String
   *  this.operation ... IOperation
   * methods:
   *  this.getWidth() ... int
   * methods for fields:
   *  this.operation.getWidth() ... int
   *  this.operation.countShapes() ... int
   *  this.operation.comboDepth() ... int
   *  this.operation.mirror() ... IOperation
   *  this.operation.pictureRecipe(int) ... String 
   * 
   */

  // returns the width of all pictures contained by this.operation
  @Override
  public int getWidth() {
    /* Template:
     * fields:
     *  this.name ... String
     *  this.operation ... IOperation
     * methods:
     *  this.getWidth() ... int
     * methods for fields:
     *  this.operation.getWidth() ... int
     *  this.operation.countShapes() ... int
     *  this.operation.comboDepth() ... int
     *  this.operation.mirror() ... IOperation
     *  this.operation.pictureRecipe(int) ... String 
     * 
     */
    return this.operation.getWidth();
  }

  // returns a count of all shapes contained by this.operation
  @Override
  public int countShapes() {
    /* Template:
     * fields:
     *  this.name ... String
     *  this.operation ... IOperation
     * methods:
     *  this.getWidth() ... int
     * methods for fields:
     *  this.operation.getWidth() ... int
     *  this.operation.countShapes() ... int
     *  this.operation.comboDepth() ... int
     *  this.operation.mirror() ... IOperation
     *  this.operation.pictureRecipe(int) ... String 
     * 
     */
    return this.operation.countShapes();
  }

  // returns the depth of operations in the combo
  @Override
  public int comboDepth() {
    /* Template:
     * fields:
     *  this.name ... String
     *  this.operation ... IOperation
     * methods:
     *  this.getWidth() ... int
     * methods for fields:
     *  this.operation.getWidth() ... int
     *  this.operation.countShapes() ... int
     *  this.operation.comboDepth() ... int
     *  this.operation.mirror() ... IOperation
     *  this.operation.pictureRecipe(int) ... String 
     * 
     */
    return this.operation.comboDepth();
  }
  
  // mirrors all Beside operations contained in this.operation
  public IPicture mirror() {
    /* Template:
     * fields:
     *  this.name ... String
     *  this.operation ... IOperation
     * methods:
     *  this.getWidth() ... int
     * methods for fields:
     *  this.operation.getWidth() ... int
     *  this.operation.countShapes() ... int
     *  this.operation.comboDepth() ... int
     *  this.operation.mirror() ... IOperation
     *  this.operation.pictureRecipe(int) ... String 
     * 
     */
    return new Combo(this.name, this.operation.mirror());
  }

  // returns a string representation of this combo
  @Override
  public String pictureRecipe(int depth) {
    /* Template:
     * fields:
     *  this.name ... String
     *  this.operation ... IOperation
     * methods:
     *  this.getWidth() ... int
     * methods for fields:
     *  this.operation.getWidth() ... int
     *  this.operation.countShapes() ... int
     *  this.operation.comboDepth() ... int
     *  this.operation.mirror() ... IOperation
     *  this.operation.pictureRecipe(int) ... String 
     * 
     */
    if (depth == 0) {
      return this.name;
    }
    else {
      return this.operation.pictureRecipe(depth - 1);
    }
  }
  
}

class ExamplesPicture {
  IPicture circle = new Shape("circle", 20);
  IPicture square = new Shape("square", 30);
  IPicture bigCircle = new Combo("big circle", new Scale(circle));
  IPicture squareOnCircle = new Combo("square on circle", new Overlay(square, bigCircle));
  IPicture doubledSquareOnCircle = new Combo("doubled square on circle", 
      new Beside(squareOnCircle, squareOnCircle));
  IPicture bigSquare = new Combo("big square", new Scale(square));
  IPicture circleOnSquare = new Combo("circle on square", new Overlay(circle, bigSquare));
  IPicture doubledCircleOnSquare = new Combo("doubled circle on square", 
      new Beside(circleOnSquare, circleOnSquare));
  IPicture squareBesideCircle = new Combo("square beside circle", new Beside(square, circle));
  IPicture besides = new Combo("doubled circle on square beside square beside circle", 
      new Beside(doubledCircleOnSquare, squareBesideCircle));
  
  boolean testGetWidth(Tester t) {
    return t.checkExpect(circle.getWidth(), 20)
        && t.checkExpect(bigCircle.getWidth(), 40)
        && t.checkExpect(doubledSquareOnCircle.getWidth(), 80);
  }
  
  boolean testCountShapes(Tester t) {
    return t.checkExpect(circle.countShapes(), 1)
        && t.checkExpect(bigCircle.countShapes(), 1)
        && t.checkExpect(squareOnCircle.countShapes(), 2)
        && t.checkExpect(doubledSquareOnCircle.countShapes(), 4);
  }
  
  boolean testMirror(Tester t) {
    return t.checkExpect(circle.mirror(), circle.mirror())
        && t.checkExpect(doubledSquareOnCircle.mirror(), doubledSquareOnCircle.mirror())
        && t.checkExpect(squareBesideCircle.mirror(), 
            new Combo("square beside circle", new Beside(circle, square)))
        && t.checkExpect(besides.mirror(), 
            new Combo("doubled circle on square beside square beside circle", 
                new Beside(squareBesideCircle.mirror(), doubledCircleOnSquare.mirror())));
  }
  
  boolean testComboDepth(Tester t) {
    return t.checkExpect(circle.comboDepth(), 0)
        && t.checkExpect(bigCircle.comboDepth(), 1)
        && t.checkExpect(doubledSquareOnCircle.comboDepth(), 3)
        && t.checkExpect(besides.comboDepth(), 4);
  }
  
  boolean testPictureRecipe(Tester t) {
    return t.checkExpect(circle.pictureRecipe(0), "circle")
        && t.checkExpect(bigCircle.pictureRecipe(1), "scale(circle)")
        && t.checkExpect(doubledSquareOnCircle.pictureRecipe(2), 
            "beside(overlay(square, big circle), overlay(square, big circle))")
        && t.checkExpect(doubledSquareOnCircle.pictureRecipe(3), 
            "beside(overlay(square, scale(circle)), overlay(square, scale(circle)))")
        && t.checkExpect(doubledSquareOnCircle.pictureRecipe(10), 
            "beside(overlay(square, scale(circle)), overlay(square, scale(circle)))");
  }
}
