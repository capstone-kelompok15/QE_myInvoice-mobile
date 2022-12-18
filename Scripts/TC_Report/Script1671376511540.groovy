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

Mobile.startApplication('C:\\Users\\User\\Downloads\\app-release (9).apk', true)

Mobile.tap(findTestObject('Object Repository/Login/splash screen'), 0)

Mobile.tap(findTestObject('Object Repository/Login/email'), 0)

Mobile.setText(findTestObject('Login/email'), 'customer@yopmail.com', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Login/password'), 0)

Mobile.setText(findTestObject('Login/password'), 'password', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Login/sign in button'), 0)

Mobile.verifyElementVisible(findTestObject('Login/home'), 0)

Mobile.tap(findTestObject('Object Repository/report/report tab'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/report/text payment report'), 0)

Mobile.tap(findTestObject('Object Repository/report/filter'), 0)

Mobile.tap(findTestObject('report/type bills'), 0)

Mobile.tap(findTestObject('report/paid radio'), 0)

Mobile.tap(findTestObject('Object Repository/report/show result button'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/report/text paid transaction'), 0)

