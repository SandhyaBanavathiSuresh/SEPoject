/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



/**
 * UML state diagram for a Library Management System, represented in Umple
 */
// line 4 "model.ump"
// line 96 "model.ump"
public class LibraryManagementSystem
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //LibraryManagementSystem State Machines
  public enum State { enterUsernameAndPassword, validateUsernameAndPassword, waitForResponse, waitForStaffPageResponse, selectTheBookToBeIssued, checkAvailability, issueBook, checkFine, payAndReturn, bookReturned, requestRenewOfABook, bookRenewed, validateStaffDetails, addNewStaffInDatabase, checkStaffExistence, deleteExistingStaffFromDatabase, validateEnteredUsernameOrBook, updateDetailsInDatabase, checkBookExistence, deleteExistingBookFromDatabase, validateBookDetails, addNewBookInDatabase, successMessage, redirectToHomepage }
  private State state;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public LibraryManagementSystem()
  {
    setState(State.enterUsernameAndPassword);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getStateFullName()
  {
    String answer = state.toString();
    return answer;
  }

  public State getState()
  {
    return state;
  }

  public boolean enterCredentials()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case enterUsernameAndPassword:
        setState(State.validateUsernameAndPassword);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean invalidCredentials()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case validateUsernameAndPassword:
        setState(State.enterUsernameAndPassword);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean redirectToUserHomepage()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case validateUsernameAndPassword:
        setState(State.waitForResponse);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean redirectToStaffHomepage()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case validateUsernameAndPassword:
        setState(State.waitForStaffPageResponse);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean viewBook()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case waitForResponse:
        setState(State.selectTheBookToBeIssued);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean returnOrRenew()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case waitForResponse:
        setState(State.checkFine);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean addNewStaffWithTheirDetails()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case waitForStaffPageResponse:
        setState(State.validateStaffDetails);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean addNewBookWithItsDetails()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case waitForStaffPageResponse:
        setState(State.validateBookDetails);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean enterStaffDetails()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case waitForStaffPageResponse:
        setState(State.checkStaffExistence);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean enterBookDetails()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case waitForStaffPageResponse:
        setState(State.checkBookExistence);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean updateDetailsByValidating()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case waitForStaffPageResponse:
        setState(State.validateEnteredUsernameOrBook);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean bookSelected()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case selectTheBookToBeIssued:
        setState(State.checkAvailability);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean yes()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case checkAvailability:
        setState(State.issueBook);
        wasEventProcessed = true;
        break;
      case checkFine:
        setState(State.payAndReturn);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean no()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case checkAvailability:
        setState(State.selectTheBookToBeIssued);
        wasEventProcessed = true;
        break;
      case checkFine:
        setState(State.requestRenewOfABook);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean updateDatabase()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case issueBook:
        setState(State.successMessage);
        wasEventProcessed = true;
        break;
      case bookReturned:
        setState(State.successMessage);
        wasEventProcessed = true;
        break;
      case bookRenewed:
        setState(State.successMessage);
        wasEventProcessed = true;
        break;
      case updateDetailsInDatabase:
        setState(State.successMessage);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean success()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case payAndReturn:
        setState(State.bookReturned);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean error()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case payAndReturn:
        setState(State.payAndReturn);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean request()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case requestRenewOfABook:
        setState(State.bookRenewed);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean validated()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case validateStaffDetails:
        setState(State.addNewStaffInDatabase);
        wasEventProcessed = true;
        break;
      case validateBookDetails:
        setState(State.addNewBookInDatabase);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean addedToDatabase()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case addNewStaffInDatabase:
        setState(State.successMessage);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean staffExists()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case checkStaffExistence:
        setState(State.deleteExistingStaffFromDatabase);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean staffDontExist()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case checkStaffExistence:
        setState(State.waitForStaffPageResponse);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean deleteFromDatabase()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case deleteExistingStaffFromDatabase:
        setState(State.successMessage);
        wasEventProcessed = true;
        break;
      case deleteExistingBookFromDatabase:
        setState(State.successMessage);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean detailsFound()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case validateEnteredUsernameOrBook:
        setState(State.updateDetailsInDatabase);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean bookFound()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case checkBookExistence:
        setState(State.deleteExistingBookFromDatabase);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean bookDontExist()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case checkBookExistence:
        setState(State.waitForStaffPageResponse);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean addTodatabase()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case addNewBookInDatabase:
        setState(State.successMessage);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean databaseUpdated()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case successMessage:
        setState(State.redirectToHomepage);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void setState(State aState)
  {
    state = aState;
  }

  public void delete()
  {}

}