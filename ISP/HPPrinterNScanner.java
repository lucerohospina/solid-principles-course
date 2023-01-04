package ISP;

// we now implement two specific interfaces here instead of the big one.

// public class HPPrinterNScanner implements IMultiFuntion {
public class HPPrinterNScanner implements IPrint, IScan {

  // Not all methods make sense to this class
  
  @Override
  public void print() {
    // assume real printing code
  }

  @Override
  public void getPrintSpoolDetails() {
    // assume real code that gets spool detail
  }

  @Override
  public void scan() {
    // assume real code for scanning
  }

  @Override
  public void scanPhoto() {
    // assume real code for photos scan
  }

  // methods no longer needed because we made specific interfaces for print, scan and fax.

  // @Override
  // public void fax() {
    
  // }

  // @Override
  // public void internetFax() {
    
  // }
}
