class FerrisWheel extends Attraction{
	
	 public FerrisWheel(int ticketsToRide, double rideLength, double ridePHour, double rideSpeed,double rideHeight ) {
		super(2 , 12, 300, 90, 220);
	}
	 AmusementPark connect = new AmusementPark();


		int Romantic;
		 
		 //unique method for Ferris Wheel subclass has an equation based on user input to determine romantic factor 
		public void romanticRating()
		{
			if(connect.getTickets()%2 == 0)
			{
			System.out.println("romantic factor is 10/10");
			
			}
			else 
			{
			System.out.println("romantic factor is 5/10");
			}
			 
		}
		 
			
		

 
	    }
 
 
 
 
 
 
