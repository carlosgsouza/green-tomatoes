import org.openqa.selenium.firefox.FirefoxDriver

driver = {
	new FirefoxDriver()
}

waiting {
	presets {
		slow {
			timeout = 10
		}
	}
}

