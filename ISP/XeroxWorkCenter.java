package ISP;

// we now implement all three specific interfaces here instead of the big one.

// public class XeroxWorkCenter implements IMultiFuntion {
public class XeroxWorkCenter implements IPrint, IScan, IFax {
  
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

  @Override
  public void fax() {
    // assume real code for fax
  }

  @Override
  public void internetFax() {
    // assume real code for internet fax
  }
}
