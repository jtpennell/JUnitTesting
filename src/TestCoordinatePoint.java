import static org.junit.Assert.*;

import org.junit.Test;

public class TestCoordinatePoint {

	/**
	 * Tests whether a CoordinatePoint created by default
	 * constructor has the correct coordinates.
	 */
	@Test
	public void testDefault() {
		try {
			CoordinatePoint p = new CoordinatePoint();
			assertEquals(0, p.getLongitude(), 0);
			assertEquals(0, p.getLatitude(), 0);
		} catch (CoordinateOutOfBoundsException e) {
			fail("CoordinateOutOfBoundsException (" + e.getMessage() + ") thrown by default constructor");
		}
	}
	
	
	/**
	 * Tests whether a LongitudeOutOfBoundsException is thrown
	 * if the longitude goes just out of bounds, with latitude
	 * at the bound.
	 */
	@Test
	public void testOOB1() {
		try {
			CoordinatePoint p = new CoordinatePoint(180.1,90);
			fail("Should trigger a LongitudeOutOfBoundsException");
		} catch (CoordinateOutOfBoundsException e) {
			assertEquals("Out of bounds longitude: 180.1", e.getMessage());
		}
	}

	/**
	 * Tests whether a LatitudeOutOfBoundsException is thrown
	 * if the latitude goes just out of bounds, with longitude
	 * at the bound. 
	 */
	@Test
	public void testOOB2() {
		try {
			CoordinatePoint p = new CoordinatePoint(180,90.1);
			fail("Should trigger a LatitudeOutOfBoundsException");
		} catch (CoordinateOutOfBoundsException e) {
			assertEquals("Out of bounds latitude: 90.1", e.getMessage());
		}
	}

	/**
	 * Tests whether a LongitudeOutOfBoundsException is thrown
	 * if the longitude goes just out of bounds, with latitude
	 * at the bound.
	 */
	@Test
	public void testOOB3() {
		try {
			CoordinatePoint p = new CoordinatePoint(-180.1,90);
			fail("Should trigger a LongitudeOutOfBoundsException");
		} catch (CoordinateOutOfBoundsException e) {
			assertEquals("Out of bounds longitude: -180.1", e.getMessage());
		}
	}

	/**
	 * Tests whether a LatitudeOutOfBoundsException is thrown
	 * if the latitude goes just out of bounds, with longitude
	 * at the bound. 
	 */
	@Test
	public void testOOB4() {
		try {
			CoordinatePoint p = new CoordinatePoint(180,-90.1);
			fail("Should trigger a LatitudeOutOfBoundsException");
		} catch (CoordinateOutOfBoundsException e) {
			assertEquals("Out of bounds latitude: -90.1", e.getMessage());
		}
	}

	/**
	 * Tests whether we can create a CoordinatePoint at maximum
	 * positive latitude and longitude. 
	 */
	@Test
	public void testOOB5() {
		try {
			CoordinatePoint p = new CoordinatePoint(180,90);
			assertEquals(180, p.getLongitude(), 0);
			assertEquals(90, p.getLatitude(), 0);
		} catch (CoordinateOutOfBoundsException e) {
			fail("Creating coordinate point to (180,90) resulted in CoordinateOutOfBoundsException");
		}
	}

	/**
	 * Tests whether we can create a CoordinatePoint at maximum
	 * negative latitude and longitude. 
	 */
	@Test
	public void testOOB6() {
		try {
			CoordinatePoint p = new CoordinatePoint(-180,-90);
			assertEquals(-180, p.getLongitude(), 0);
			assertEquals(-90, p.getLatitude(), 0);
		} catch (CoordinateOutOfBoundsException e) {
			fail("Creating coordinate point to (-180,-90) resulted in CoordinateOutOfBoundsException");
		}
	}
	/**
	 * Tests if we can set a longitude value at its
	 * maximum positive position.
	 */
	@Test
	public void testsetLongitude1(){
		try{
			CoordinatePoint p = new CoordinatePoint();
			p.setLongitude(180);
			assertEquals(180, p.getLongitude(), 0);
		} catch (CoordinateOutOfBoundsException e){
			fail("Longitude should be 180");
		}
	}
	/**
	 * Tests whether we can set a longitude value at
	 * its maximum negative position.
	 */
	@Test
	public void testsetLongitude2(){
		try{
			CoordinatePoint p = new CoordinatePoint();
			p.setLongitude(-180);
			assertEquals(-180, p.getLongitude(), 0);
		} catch (CoordinateOutOfBoundsException e){
			fail("Longitude should be -180");
		}
	}
	/**
	 * Tests if we can set an invalid longitude value just
	 * over its maximum positive position.
	 */
	@Test
	public void testsetLongitude3(){
		try{
			CoordinatePoint p = new CoordinatePoint();
			p.setLongitude(180.1);
			fail("Should trigger a LongitudeOutOfBoundsException");
		} catch (CoordinateOutOfBoundsException e) {
			assertEquals("Out of bounds longitude: 180.1", e.getMessage());
		}
	}
	/**
	 * Tests whether we can set a longitude value
	 * just over its maximum negative position.
	 */
	@Test
	public void testsetLongitude4(){
		try{
			CoordinatePoint p = new CoordinatePoint();
			p.setLongitude(-180.1);
			fail("Should trigger a LongitudeOutOfBoundsException");
		} catch (CoordinateOutOfBoundsException e){
			assertEquals("Out of bounds longitude: -180.1",e.getMessage());
		}
	}
	/**
	 * Tests whether we can set a latitude value at 
	 * its maximum positive position.
	 */
	@Test
	public void testsetLatitude1(){
		try{
			CoordinatePoint p = new CoordinatePoint();
			p.setLatitude(90);
			assertEquals(90, p.getLatitude(), 0);
		} catch (CoordinateOutOfBoundsException e){
			fail("Latitude should be 90");
		}
	}
	/**
	 * Tests whether we can set a latitude value at 
	 * its maximum negative position.
	 */
	@Test
	public void testsetLatitude2(){
		try{
			CoordinatePoint p = new CoordinatePoint();
			p.setLatitude(-90);
			assertEquals(-90, p.getLatitude(), 0);
		} catch (CoordinateOutOfBoundsException e){
			fail("Latitude should be -90");
		}
	}
	
	/**
	 * Tests whether we can set a latitude value
	 * just over its maximum positive position.
	 */
	@Test
	public void testsetLatitude3(){
		try{
			CoordinatePoint p = new CoordinatePoint();
			p.setLatitude(90.1);
			fail("Should trigger LatitudeOutOfBoundsException");
		} catch (CoordinateOutOfBoundsException e){
			assertEquals("Out of bounds latitude: 90.1 ", e.getMessage());
		}
	}
	/**
	 * Tests whether we can set a latitude value
	 * just over its maximum negative position.
	 */
	@Test
	public void testsetLatitude4(){
		try{
			CoordinatePoint p = new CoordinatePoint();
			p.setLatitude(-90.1);
			fail("Should trigger a LatitudeOutOfBoundsException");
		} catch (CoordinateOutOfBoundsException e){
			assertEquals("Out of bounds latitude: -90.1",e.getMessage());
		}
	}

}
