class MerryGoRound extends Attraction{ 
	MerryGoRound attraction = new MerryGoRound();
	attraction.ridersHour(540);	//18 seats * 60 min/2 min ride = 540
	attraction.RideSpeed(8); //Illegal to go 9
	attraction.RideHeight(2); //Height horse is off the ground
	attraction.ticketsPerRide(1);
	attraction.rideLength(2);
	//method for MeeryGoRound that tracks how many times it spins
	public int spinsPerRide(int spins)
	{
		spins = rideLength * 5;
		return spins;
	}

}
