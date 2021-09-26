@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = {MyApplication.class, MyTest.TestConfig.class})
public class MyTest {

	@TestConfiguration
	public static class TestConfig {

		@Bean
		@Primary
		public MyService myService() {
			return new MyServiceImpl();
			//or use Mockito to mock object
			//MyService myService = Mockito.mock(MyService.class);
			//Mockito.doNothing().when(myService).doService();
			//return myService;
		}

	}

	@Autowired
	private MyController myController;

	@Test
	public void test() {
		myController.doTest();
	}

}