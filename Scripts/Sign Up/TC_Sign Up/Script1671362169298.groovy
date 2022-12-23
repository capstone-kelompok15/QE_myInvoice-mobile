import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\User\\Downloads\\app-release (11).apk', true)

Mobile.tap(findTestObject('Object Repository/Login/splash screen'), 0)

Mobile.tap(findTestObject('Object Repository/Sign UP/Sign up hyperlink'), 0)

Mobile.tap(findTestObject('Object Repository/Sign UP/FullName'), 0)

Mobile.setText(findTestObject('Sign UP/FullName'), fullName, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Sign UP/Email'), 0)

Mobile.setText(findTestObject('Sign UP/Email'), email, 2)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Sign UP/Password'), 2)

Mobile.setText(findTestObject('Sign UP/Password'), password, 2)

Mobile.hideKeyboard()

Mobile.scrollToText('********', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Sign UP/confirm lagi lagi'), 2)

Mobile.setText(findTestObject('Sign UP/confirm lagi lagi'), confirmPassword, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Sign UP/create account button'), 0)

// Fulname kosong
if (fullName == '') {
    Mobile.verifyElementVisible(findTestObject('Object Repository/Sign UP/empty fullname'), 0 // Email kosong
        // Password kosong
        // confirm password kosong
        // bukan format email
        //  8 > password > 16
        //password doesn't match
        )
} else if (email == '') {
    Mobile.verifyElementVisible(findTestObject('Object Repository/Sign UP/empty email'), 0)
} else if (password == '') {
    Mobile.verifyElementVisible(findTestObject('Object Repository/Sign UP/empty password'), 0)
} else if (confirmPassword == '') {
    Mobile.verifyElementVisible(findTestObject('Object Repository/Sign UP/empty confirm pasword'), 0)
} else if (email.contains('.com') == false) {
    Mobile.verifyElementVisible(findTestObject('Object Repository/Sign UP/invalid email error'), 0)
} else if ((password.length() < 8) || (password.length() > 16)) {
    Mobile.verifyElementVisible(findTestObject('Object Repository/Sign UP/length password error'), 0)
} else if (password != confirmPassword) {
    Mobile.verifyElementVisible(findTestObject('Object Repository/Sign UP/password match error'), 0)
} else {
    Mobile.verifyElementVisible(findTestObject('Object Repository/Sign UP/pop up register'), 0)
}

Mobile.closeApplication()

