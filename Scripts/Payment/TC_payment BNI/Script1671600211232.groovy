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

WebUI.callTestCase(findTestCase('Sign In/TC_positive Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('list invoice/tab invoice'), 2)

Mobile.tap(findTestObject('Payment method/list pay'), 2)

Mobile.tap(findTestObject('Payment method/payment method'), 2)

Mobile.tap(findTestObject('Payment method/BNI'), 2)

Mobile.tap(findTestObject('Payment method/pay now button'), 2)

Mobile.tap(findTestObject('Payment method/confirm payment'), 2)

Mobile.tap(findTestObject('Payment method/Upload bukti'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Payment method/image'), 0)

Mobile.tap(findTestObject('Payment method/confirm button'), 0)

Mobile.verifyElementVisible(findTestObject('Payment method/waiting for confirmation text'), 0)

Mobile.tap(findTestObject('Payment method/back to home button'), 0)

Mobile.closeApplication()

