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

WebUI.callTestCase(findTestCase('FreCRM/FreeCRMLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('FreeCRM/Page_SuiteCRM/a_Accounts'))

WebUI.click(findTestObject('FreeCRM/Page_SuiteCRM/a_Plus Icon   Create Account'))

WebUI.setText(findTestObject('FreeCRM/Page_SuiteCRM/iName'), name)

WebUI.setText(findTestObject('FreeCRM/Page_SuiteCRM/input_WEBSITE_form-control form'), website)

WebUI.setText(findTestObject('FreeCRM/Page_SuiteCRM/input_Billing Street_form-control form'), bstreet)

WebUI.setText(findTestObject('FreeCRM/Page_SuiteCRM/input_Billing Postal Code_form'), bpostalcode)

WebUI.setText(findTestObject('FreeCRM/Page_SuiteCRM/input_Billing City_form-control form'), bcity)

WebUI.setText(findTestObject('FreeCRM/Page_SuiteCRM/Page_SuiteCRM/input_Billing State_form-control form-control-sm ng-untouched ng-pristine ng-valid'), 
    bstate)

WebUI.setText(findTestObject('FreeCRM/Page_SuiteCRM/input_Billing Country_form-control form'), bcountry)

WebUI.setText(findTestObject('FreeCRM/Page_SuiteCRM/Page_SuiteCRM/input_Shipping Street_form-control form-control-sm ng-untouched ng-pristine ng-valid'), 
    sstreet)

WebUI.setText(findTestObject('FreeCRM/Page_SuiteCRM/Page_SuiteCRM/input_Shipping Postal Code_form-control form-control-sm ng-untouched ng-pristine ng-valid'), 
    spostalcode)

WebUI.setText(findTestObject('FreeCRM/Page_SuiteCRM/Page_SuiteCRM/input_Shipping City_form-control form-control-sm ng-untouched ng-pristine ng-valid'), 
    scity)

WebUI.setText(findTestObject('FreeCRM/Page_SuiteCRM/Page_SuiteCRM/input_Shipping State_form-control form-control-sm ng-untouched ng-pristine ng-valid'), 
    sstate)

WebUI.setText(findTestObject('FreeCRM/Page_SuiteCRM/Page_SuiteCRM/input_Shipping Country_form-control form-control-sm ng-untouched ng-pristine ng-valid'), 
    scountry)

WebUI.setText(findTestObject('FreeCRM/Page_SuiteCRM/Page_SuiteCRM/input_FAX_form-control form-control-sm ng-untouched ng-pristine ng-valid'), 
    fax)

WebUI.setText(findTestObject('FreeCRM/Page_SuiteCRM/Page_SuiteCRM/input_OFFICE PHONE_form-control form-control-sm ng-untouched ng-pristine ng-valid'), 
    officephone)

WebUI.scrollToElement(findTestObject('FreeCRM/Page_SuiteCRM/button_Save'), 3)

WebUI.executeJavaScript('window.scrollTo(document.body.scrollHeight, 0)', [])

WebUI.click(findTestObject('FreeCRM/Page_SuiteCRM/button_Save'))

WebUI.mouseOver(findTestObject('FreeCRM/Page_SuiteCRM/Page_SuiteCRM/a_User Icon         Will Westin'))

WebUI.click(findTestObject('FreeCRM/Page_SuiteCRM/Page_SuiteCRM/a_Logout'))

WebUI.closeBrowser()

