package ISP;

// INTERFACE SEGREGATION PRINCIPLE
// No client should be force to depend on methods it does not use.
// Identifying violations to ISP: 1) Fat interfaces
// 2) Interfaces with low cohesion
// 3) Empty method implementations

// Let's split this interface into smaller ones (see IPrint, IScan and IFax files)

public interface IMultiFuntion {
  public void print();
  public void getPrintSpoolDetails();
  public void scan();
  public void scanPhoto();
  public void fax();
  public void internetFax();
}
