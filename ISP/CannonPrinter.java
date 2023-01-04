package ISP;

// we now implement just one specific interface here instead of the big one.

// public class CannonPrinter implements IMultiFuntion {
public class CannonPrinter implements IPrint {

  // Not all methods make sense to this class

  @Override
  public void print() {
    // assume real printing code
  }

  @Override
  public void getPrintSpoolDetails() {
    // assume real code that gets spool detail
  }

  // methods no longer needed because we made specific interfaces for print, scan and fax.

  // @Override
  // public void scan() {
   
  // }

  // @Override
  // public void scanPhoto() {
    
  // }

  // @Override
  // public void fax() {
    
  // }

  // @Override
  // public void internetFax() {
    
  // }
}
