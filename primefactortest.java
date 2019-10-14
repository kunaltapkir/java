
class primefactortest {

	private List<Integer> list(Integer... integers) {
		return Arrays.asList(integers);
	}

	@Test
	public void testOne() {
		assertEquals(list(), Primefactor.generate(1));
	}

	@Test
	public void testTwo() {
		assertEquals(list(2), Primefactor.generate(2));
	}

	@Test
	public void testThree() {
		assertEquals(list(3), Primefactor.generate(3));
	}

	@Test
	public void testFour() {
		assertEquals(list(2, 2), Primefactor.generate(4));
	}

	@Test
	public void testSix() {
		assertEquals(list(2, 3), Primefactor.generate(6));
	}

	@Test
	public void testEight() {
		assertEquals(list(2, 2, 2), Primefactor.generate(8));
	}

	@Test
	public void testNine() {
		assertEquals(list(3, 3), Primefactor.generate(9));
	}

}
