import static org.junit.Assert.*;

import org.junit.Test;

public class TestNavigator {
	/**
	 * Tests whether origin is (0,0) when the constructor is
	 * is initialized
	 */
	@Test
	public void testNavigator1() {
		try {
			Navigator n = new Navigator();
			assertEquals(0,n.getOriginLongitude(),0);
			assertEquals(0,n.getOriginLatitude(),0);
		}catch(CoordinateOutOfBoundsException e){
			fail("Origin is not set to default zero");
		}
	}
	/**
	 * Tests whether destination is (0,0) when the constructor is
	 * is initialized.
	 */
	@Test
	public void testNavigator2() {
		try {
			Navigator n = new Navigator();
			assertEquals(0,n.getDestinationLongitude(),0);
			assertEquals(0,n.getDestinationLatitude(),0);
		}catch(CoordinateOutOfBoundsException e){
			fail("Destination is not set to default zero");
		}
	}
	/**
	 * Tests whether a valid CoordinatePoint at its maximum positive bound can be set for origin.
	 */
	@Test
	public void testSetOrigin1() {
		try {
			Navigator n = new Navigator();
			CoordinatePoint p = new CoordinatePoint(180,90);
			n.setOrigin(p);
			assertEquals(180,n.getOriginLongitude(),0);
			assertEquals(90, n.getOriginLatitude(), 0);
		}catch (CoordinateOutOfBoundsException e) {
			fail("Origin coordinates should be: 180,90");
		}
	}
	/**
	 * Tests whether a valid CoordinatePoint at its maximum negative bound can be set for origin.
	 */
	@Test
	public void testSetOrigin2() {
		try {
			Navigator n = new Navigator();
			CoordinatePoint p = new CoordinatePoint(-180,-90);
			n.setOrigin(p);
			assertEquals(180,n.getOriginLongitude(),0);
			assertEquals(90, n.getOriginLatitude(), 0);
		}catch (CoordinateOutOfBoundsException e) {
			fail("Origin coordinates should be: 180,90");
		}
	}
	/**
	 * Tests whether an invalid CoordinatePoint can be set for origin.
	 */
	@Test
	public void testSetOrigin3() {
		try {
			Navigator n = new Navigator();
			CoordinatePoint p = new CoordinatePoint(180.1,90);
			n.setOrigin(p);
			fail("Should trigger a LongitudeOutOfBoundsException");
		}catch (CoordinateOutOfBoundsException e) {
			assertEquals("Out of bounds longitude: 180.1",e.getMessage());
		}
	}
	/**
	 * Tests whether setting valid latitude and longitude parameters
	 * for the overloaded method setOrigin
	 */
	@Test
	public void testSetOrigin4() {
		try {
			Navigator n = new Navigator();
			n.setOrigin(180,90);
			assertEquals(180,n.getOriginLongitude(),0);
			assertEquals(90, n.getOriginLatitude(), 0);
		}catch (CoordinateOutOfBoundsException e) {
			fail("Origin coordinates should be: 180,90");
		}
	}
	/**
	 * Tests whether you can set a latitude just over its maximum positive bound
	 * and a longitude within its bounds for the overloaded method setOrigin
	 */
	@Test
	public void testSetOrigin5() {
		try {
			Navigator n = new Navigator();
			n.setOrigin(180,90.1);
			fail("Should trigger a LatitudeOutOfBoundsException");
		}catch (CoordinateOutOfBoundsException e) {
			assertEquals("Out of bounds latitude: 90.1",e.getMessage());
		}
	}
	/**
	 * Tests whether setting a valid latitude and a longitude
	 * just over its maximum positive bound for the overloaded method setOrigin
	 */
	@Test
	public void testSetOrigin6() {
		try {
			Navigator n = new Navigator();
			n.setOrigin(180.1,90);
			fail("Should trigger a LongitudeOutOfBoundsException");
		}catch (CoordinateOutOfBoundsException e) {
			assertEquals("Out of bounds longitude: 180.1",e.getMessage());
		}
	}
	/**
	 * Tests whether you can set a latitude just over its maximum negative bound
	 * and a longitude within its bounds for the overloaded method setOrigin
	 */
	@Test
	public void testSetOrigin7() {
		try {
			Navigator n = new Navigator();
			n.setOrigin(180,-90.1);
			fail("Should trigger a LatitudeOutOfBoundsException");
		}catch (CoordinateOutOfBoundsException e) {
			assertEquals("Out of bounds latitude: -90.1",e.getMessage());
		}
	}
	/**
	 * Tests whether you can set a valid latitude and a longitude
	 * just over its maximum negative bound for the overloaded method setOrigin
	 */
	@Test
	public void testSetOrigin8() {
		try {
			Navigator n = new Navigator();
			n.setOrigin(-180.1,90);
			fail("Should trigger a LongitudeOutOfBoundsException");
		}catch (CoordinateOutOfBoundsException e) {
			assertEquals("Out of bounds longitude: -180.1",e.getMessage());
		}
	}
	/**
	 * Tests whether you can set the maximum positive origin longitude for
	 * the origin object
	 */
	@Test
	public void testSetOriginLongitude1() {
		try {
			Navigator n = new Navigator();
			n.setOriginLongitude(180);
			assertEquals(180,n.getOriginLongitude(),0);
		}catch (CoordinateOutOfBoundsException e) {
			fail("Origin longitude should be: 180");
		}
	}
	/**
	 * Tests whether you can set a origin longitude just over the maximum
	 * positive bound.
	 */
	@Test
	public void testSetOriginLongitude2() {
		try {
			Navigator n = new Navigator();
			n.setOriginLongitude(180.1);
			fail("Should trigger LongitudeOutOfBoundsException");
		}catch (CoordinateOutOfBoundsException e) {
			assertEquals("Out of bounds longitude: 180.1", e.getMessage());
		}
	}
	/**
	 * Tests whether you can set a origin longitude at the maximum
	 * negative bound
	 */
	@Test
	public void testSetOriginLongitude3() {
		try {
			Navigator n = new Navigator();
			n.setOriginLongitude(-180);
			assertEquals(-180,n.getOriginLongitude(),0);
		}catch (CoordinateOutOfBoundsException e) {
			fail("Origin longitude should be: -180");
		}
	}
	/**
	 * Tests whether you can set a origin longitude value just over
	 * its maximum negative bound.
	 */
	@Test
	public void testSetOriginLongitude4() {
		try {
			Navigator n = new Navigator();
			n.setOriginLongitude(-180.1);
			fail("Should trigger LongitudeOutOfBoundsException");
		}catch (CoordinateOutOfBoundsException e) {
			assertEquals("Out of bounds longitude: -180.1", e.getMessage());
		}
	}
	/**
	 * Tests whether you can set an origin latitude value 
	 * at its maximum positive position 
	 */
	@Test
	public void testSetOriginLatitude1() {
		try {
			Navigator n = new Navigator();
			n.setOriginLatitude(90);
			assertEquals(90,n.getOriginLatitude(),0);
		}catch (CoordinateOutOfBoundsException e) {
			fail("Origin lattude should be: 90");
		}
	}
	/**
	 * Tests whether you can set an origin latitude position
	 * just over its maximum positive bound
	 */
	@Test
	public void testSetOriginLatitude2() {
		try {
			Navigator n = new Navigator();
			n.setOriginLatitude(90.1);
			fail("Should trigger a LatitudeOutOfBoundsExeption");
		}catch (CoordinateOutOfBoundsException e) {
			assertEquals("Out of bounds latitude: 90.1", e.getMessage());
		}
	}
	/**
	 * Tests whether you can set an origin latitude value just at
	 * its maximum negative position
	 */
	@Test
	public void testSetOriginLatitude3() {
		try {
			Navigator n = new Navigator();
			n.setOriginLatitude(-90);
			assertEquals(-90,n.getOriginLatitude(),0);
		}catch (CoordinateOutOfBoundsException e) {
			fail("Origin lattude should be: -90");
		}
	}
	/**
	 * Tests whether you can set an origin latitude value just
	 * over its maximum negative position.
	 */
	@Test
	public void testSetOriginLatitude4() {
		try {
			Navigator n = new Navigator();
			n.setOriginLatitude(-90.1);
			fail("Should trigger a LatitudeOutOfBoundsExeption");
		}catch (CoordinateOutOfBoundsException e) {
			assertEquals("Out of bounds latitude: -90.1", e.getMessage());
		}
	}
	/**
	 * Tests whether you can set CoordinatiePoint object at its maximum positive bound as 
	 * destination
	 */
	@Test
	public void testSetDestination1() {
		try {
			Navigator n = new Navigator();
			CoordinatePoint p = new CoordinatePoint(180,90);
			n.setDestination(p);
			assertEquals(180,n.getDestinationLongitude(),0);
			assertEquals(90, n.getDestinationLatitude(), 0);
		}catch (CoordinateOutOfBoundsException e) {
			fail("Destination coordinates should be: 180,90");
		}
	}
	/**
	 * Tests whether you can set an invalid CoordinatiePoint object as 
	 * destination
	 */
	@Test
	public void testSetDestination2() {
		try {
			Navigator n = new Navigator();
			CoordinatePoint p = new CoordinatePoint(180,90.1);
			n.setDestination(p);
			fail("Should trigger a LatitudeOutOfBoundsException");
		}catch (CoordinateOutOfBoundsException e) {
			assertEquals("Out of bounds latitude: 90.1",e.getMessage());
		}
	}
	/**
	 * Test whether you can set valid latitude and longitude points at their maximum positive
	 * bound for the overloaded method setDestination
	 */
	@Test
	public void testSetDestination3() {
		try {
			Navigator n = new Navigator();
			n.setDestination(180,90);
			assertEquals(180,n.getDestinationLongitude(),0);
			assertEquals(90, n.getDestinationLatitude(), 0);
		}catch (CoordinateOutOfBoundsException e) {
			fail("Destination coordinates should be: 180,90");
		}
	}
	/**
	 * Test whether you can set valid latitude and longitude points at their maximum negative
	 * bound for the overloaded method setDestination
	 */
	@Test
	public void testSetDestination4() {
		try {
			Navigator n = new Navigator();
			n.setDestination(-180,-90);
			assertEquals(-180,n.getDestinationLongitude(),0);
			assertEquals(-90, n.getDestinationLatitude(), 0);
		}catch (CoordinateOutOfBoundsException e) {
			fail("Destination coordinates should be: -180,-90");
		}
	}
	/**
	 * Test whether you can set an invalid longitude just over its maximum positive bound 
	 * and a valid latitude for the overloaded method setDestination
	 */
	@Test
	public void testSetDestination5() {
		try {
			Navigator n = new Navigator();
			n.setDestination(180.1,90);
			fail("Should throw a LatitudeOutOfBoundsException");
		}catch (CoordinateOutOfBoundsException e) {
			assertEquals("Out of bounds longitude: 180.1",e.getMessage());
		}
	}
	/**
	 * Test whether you can set an invalid latitude just over its maximum positive bound 
	 * and a valid longitude for the overloaded method setDestination
	 */
	@Test
	public void testSetDestination6() {
		try {
			Navigator n = new Navigator();
			n.setDestination(180,90.1);
			fail("Should throw a LatitudeOutOfBoundsException");
		}catch (CoordinateOutOfBoundsException e) {
			assertEquals("Out of bounds longitude: 90.1",e.getMessage());
		}
	}
	/**
	 * Test whether you can set an invalid latitude just over its maximum negative bound 
	 * and a valid longitude for the overloaded method setDestination
	 */
	@Test
	public void testSetDestination7() {
		try {
			Navigator n = new Navigator();
			n.setDestination(180,-90.1);
			fail("Should throw a LatitudeOutOfBoundsException");
		}catch (CoordinateOutOfBoundsException e) {
			assertEquals("Out of bounds latitude: -90.1",e.getMessage());
		}
	}
	/**
	 * Test whether you can set an invalid longitude over its maximum negative bound
	 * and a valid latitude for the overloaded method setDestination
	 */
	@Test
	public void testSetDestination8() {
		try {
			Navigator n = new Navigator();
			n.setDestination(-180.1,90);
			fail("Should throw a LongitudeOutOfBoundsException");
		}catch (CoordinateOutOfBoundsException e) {
			assertEquals("Out of bounds longitude: -180.1",e.getMessage());
		}
	}
	/**
	 * Tests whether you can set the maximum positive longitude value for destination
	 */
	@Test
	public void testSetDestinationLongitude1() {
		try {
			Navigator n = new Navigator();
			n.setDestinationLongitude(180);
			assertEquals(180,n.getDestinationLongitude(),0);
		}catch (CoordinateOutOfBoundsException e) {
			fail("Destination longitude should be: 180");
		}
	}
	/**
	 * Tests whether you can set a value just over the maximum positive bound
	 * for destination.
	 */
	@Test
	public void testSetDestinationLongitude2() {
		try {
			Navigator n = new Navigator();
			n.setDestinationLongitude(180.1);
			fail("Should trigger LongitudeOutOfBoundsException");
		}catch (CoordinateOutOfBoundsException e) {
			assertEquals("Out of bounds longitude: 180.1", e.getMessage());
		}
	}
	/**
	 * Tests whether you can set a longitude value at its maximum negative bound
	 * for destination
	 */
	@Test
	public void testSetDestinationLongitude3() {
		try {
			Navigator n = new Navigator();
			n.setDestinationLongitude(-180);
			assertEquals(-180,n.getDestinationLongitude(),0);
		}catch (CoordinateOutOfBoundsException e) {
			fail("Destination longitude should be: -180");
		}
	}
	/**
	 * Tests whether you can set destination longitude just over its maximum 
	 * negative bound
	 */
	@Test
	public void testSetDestinationLongitude4() {
		try {
			Navigator n = new Navigator();
			n.setDestinationLongitude(-180.1);
			fail("Should trigger LongitudeOutOfBoundsException");
		}catch (CoordinateOutOfBoundsException e) {
			assertEquals("Out of bounds longitude: -180.1", e.getMessage());
		}
	}
	/**
	 * Tests whether you can set destination latitude just at its maximum
	 * positive bound
	 */
	@Test
	public void testSetDestinationLatitude1() {
		try {
			Navigator n = new Navigator();
			n.setDestinationLatitude(90);
			assertEquals(90,n.getDestinationLatitude(),0);
		}catch (CoordinateOutOfBoundsException e) {
			fail("Destination latitude should be: 90");
		}
	}
	/**
	 * Tests whether you can set destination latitude just over
	 * its maximum negative bound.
	 */
	@Test
	public void testSetDestinationLatitude2() {
		try {
			Navigator n = new Navigator();
			n.setDestinationLatitude(90.1);
			fail("Should trigger LatitudeOutOfBoundsException");
		}catch (CoordinateOutOfBoundsException e) {
			assertEquals("Out of bounds latitude: 90.1",e.getMessage());
		}
	}
	/**
	 * Tests whether you can set destination latitude just at its
	 * maximum negative bound
	 */
	@Test
	public void testSetDestinationLatitude3() {
		try {
			Navigator n = new Navigator();
			n.setDestinationLatitude(-90);
			assertEquals(-90,n.getDestinationLatitude(),0);
		}catch (CoordinateOutOfBoundsException e) {
			fail("Destination latitude should be: -90");
		}
	}
	/**
	 * Tests whether you can set destination latitude just over its
	 * maximum negative bound
	 */
	@Test
	public void testSetDestinationLatitude4() {
		try {
			Navigator n = new Navigator();
			n.setDestinationLatitude(-90.1);
			fail("Should trigger LatitudeOutOfBoundsException");
		}catch (CoordinateOutOfBoundsException e) {
			assertEquals("Out of bounds latitude: -90.1",e.getMessage());
		}
	}
	/**
	 * Tests whether you get zero distance in km when you invoke the 
	 * DistanceInKm method
	 */
	@Test
	public void testDistanceKm1(){
		try{
			Navigator n = new Navigator();
			n.setOrigin(180,90);
			n.setDestination(180,90);
			assertEquals(0,n.distanceInKm(),0);
		}catch(CoordinateOutOfBoundsException e){
			fail("Coordinates are within the bounds");
		}
	}
	/**
	 * Tests whether you get an invalid answer when using sine instead of arc sine 
	 * for the calculation inside the method DistanceInKm 
	 */
	@Test
	public void testDistanceKm2(){
		try{
			Navigator n = new Navigator();
			n.setOrigin(0,0);
			n.setDestination(180,90);
			double la1 = Math.PI*0/180;
			double la2 = Math.PI*90/180;
			double lo1 = Math.PI*0/180;
			double lo2 = Math.PI*180/180;
			double diffla2 = (la2-la1)/2;
			double difflo2 = (lo2-lo1)/2;
			double result = 2*6371 * Math.asin(
					Math.sqrt(
							Math.sin(diffla2) * Math.asin(diffla2)
							+ Math.cos(la1)*Math.cos(la2) 
							* Math.sin(difflo2) * Math.sin(difflo2)
								)
						);
			assertEquals(result,n.distanceInKm(),0);
		}catch(CoordinateOutOfBoundsException e){
			fail("Coordinates are out of bounds");
		}
	}
	/**
	 * Tests whether you get a LongitudeOutOfBoundsError when given an invalid
	 * longitude value in origin
	 */
	@Test
	public void testDistanceKm3(){
		try{
			Navigator n = new Navigator();
			n.setOrigin(-180.1,90);
			n.setDestination(180,-90);
			fail("Should trigger a LongitudeOutOfBoundsError for origin");
		}catch(CoordinateOutOfBoundsException e){
			assertEquals("Out of bounds longitude: -180.1", e.getMessage());
		}
	}
	/**
	 * Tests whether you get a LongitudeOutOfBoundsError when given an invalid
	 * latitude value in origin
	 */
	@Test
	public void testDistanceKm4(){
		try{
			Navigator n = new Navigator();
			n.setOrigin(180,90.1);
			n.setDestination(180,90);
			fail("Should trigger a LatitudeOutOfBoundsException for Origin");
		}catch(CoordinateOutOfBoundsException e){
			assertEquals("Out of bounds latitude: 90.1",e.getMessage());
		}
	}
	/**
	 * Tests whether you get zero Nm when given two valid origin and 
	 * destination values
	 */
	@Test
	public void testDistanceNm1(){
		try{
			Navigator n = new Navigator();
			n.setOrigin(180,90);
			n.setDestination(180,90);
			assertEquals(0,n.distanceInKm(),0);
		}catch(CoordinateOutOfBoundsException e){
			fail("Coordinates are within bounds");
		}
	}
	/**
	 * Tests whether you get a LongitudeOutOfBoundsError when given an invalid
	 * longitude value in destination
	 */
	@Test
	public void testDistanceNm2(){
		try{
			Navigator n = new Navigator();
			n.setOrigin(-180,90);
			n.setDestination(180.1,-90);
			fail("Should trigger a LongitudeOutOfBoundsException for destination");
		}catch(CoordinateOutOfBoundsException e){
			assertEquals("Out of bounds longitude: -180.1", e.getMessage());
		}
	}
	/**
	 * Tests whether you get an invalid answer when sine and cosine 
	 * are swapped inside the calculation of the method DistanceInKm 
	 */
	@Test
	public void testDistanceNm3(){
		try{
			Navigator n = new Navigator();
			n.setOrigin(180,-90);
			n.setDestination(-180,90);
			double la1 = Math.PI*-90/180;
			double la2 = Math.PI*90/180;
			double lo1 = Math.PI*180/180;
			double lo2 = Math.PI*-180/180;
			double diffla2 = (la2-la1)/2;
			double difflo2 = (lo2-lo1)/2;
			double result = 2*6371 * Math.asin(
					Math.sqrt(
							Math.cos(diffla2) * Math.cos(diffla2)
							+ Math.sin(la1)*Math.sin(la2) 
							* Math.cos(difflo2) * Math.cos(difflo2)
								)
						);
			assertEquals(result/1.852,n.distanceInNM(),0);
		}catch(CoordinateOutOfBoundsException e){
			fail("Coordinates are out of bounds");
		}
	}
	/**
	 * Tests whether you get a LatitudeOutOfBoundsError when given an invalid
	 * latitude value in destination
	 */
	@Test
	public void testDistanceNm4(){
		try{
			Navigator n = new Navigator();
			n.setOrigin(180,90);
			n.setDestination(180,90.1);
			fail("Should trigger a LatitudeOutOfBoundsException for destination");
		}catch(CoordinateOutOfBoundsException e){
			assertEquals("Out of bounds latitude: 90.1", e.getMessage());
		}
	}
}
