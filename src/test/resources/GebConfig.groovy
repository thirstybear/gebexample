import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeDriverService

driver = {
    def driverBuilder = new ChromeDriverService.Builder()
    if (!System.getenv('CI')) {
        def osSpecificDriverSuffix = System.getProperty('os.name').replaceAll(' ', '').toLowerCase().substring(0, 3)
        driverBuilder.usingDriverExecutable(new File("./support/chromedriver-$osSpecificDriverSuffix"))
    }
    new ChromeDriver(driverBuilder.build())
}
