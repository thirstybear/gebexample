import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeDriverService

driver = { new ChromeDriver(new ChromeDriverService.Builder()
        .usingDriverExecutable(new File('/Applications/Google Chrome.app/Contents/MacOS/Google Chrome'))
        .build()) }