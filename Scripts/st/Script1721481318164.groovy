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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://127.0.0.1:5500/index.html')

WebUI.click(findTestObject('Object Repository/Page_Books4MU/div_home_login-btn'))

WebUI.setText(findTestObject('Object Repository/Page_Books4MU/input_username_box'), 'admin@admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Books4MU/input_password_box'), 'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/Page_Books4MU/input_password_remember-me'))

WebUI.click(findTestObject('Object Repository/Page_Books4MU/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Books4MU/a_home_fas fa-shopping-cart'))

WebUI.click(findTestObject('Object Repository/Page_Cart page/a_Checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_First name_firstName'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Last name_lastName'), 'b')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input__username'), 'ab')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Address_address'), 'abc')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkout/select_Choose.                india'), 'india', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkout/select_Choose.                Karnataka'), 'Karnataka', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Zip_zip'), '560083')

WebUI.click(findTestObject('Object Repository/Page_Checkout/input_Zip code required_same-address'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/input_Shipping address is the same as my bi_a35bde'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Name on card_cc-name'), 'abc')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Credit card number_cc-number'), '111')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Expiration_cc-expiration'), '10/27')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_CVV_cc-cvv'), '000')

WebUI.click(findTestObject('Object Repository/Page_Checkout/button_Continue to checkout'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/a_home'))

WebUI.closeBrowser()

