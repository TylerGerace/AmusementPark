class MerryGoRound extends Attraction{ 
	MerryGoRound attraction = new MerryGoRound();
	attraction.rideSpeed(8); //Illegal to go 9
	attraction.rideHeight(2); //Height horse is off the ground
	attraction.ticketsToRide(1);
	attraction.rideLength(2);
	//method for MeeryGoRound that tracks how many times it spins
	public int spinsPerRide(int spins)
	{
		spins = rideLength * 5;
		return spins;
	}

}
