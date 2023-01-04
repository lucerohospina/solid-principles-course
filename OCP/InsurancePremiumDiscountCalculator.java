package OCP;

// OPEN-CLOSED PRICIPLE
// Software component should be CLOSED for modification but OPEN for extension
// CLOSED for modification: new features getting added to the software component shoul not have to modify existing code
// OPEN for extension: a software component should be extendable to add a new feature or to add a new behavior to it

public class InsurancePremiumDiscountCalculator {

  // First approach for this method when company only workd with Health insurance.
  // public int caculatePremiumDiscountPercent(HealthInsuranceCustomerProfile customer) {
  //   if (customer.isLoyalCustomer()) {
  //     return 20;
  //   }

  //   return 0;
  // }

  // Let's implement the new method with the new interface CustomerProfile that supports both classes (and future added insurance types): Health and Insurance

  public int caculatePremiumDiscountPercent(CustomerProfile customer) {
    if (customer.isLoyalCustomer()) {
      return 20;
    }

    return 0;
  }

  // now the health insurance company insure for vehicles as well.
  // Let's add a method to calculate premiun for vehicle
  // Since we are opening this class for modification we should look for a better/cleaner solution

  // public int caculatePremiumDiscountPercent(VehicleInsuranceCustomerProfile customer) {
  //   if (customer.isLoyalCustomer()) {
  //     return 20;
  //   }

  //   return 0;
  // }
}
