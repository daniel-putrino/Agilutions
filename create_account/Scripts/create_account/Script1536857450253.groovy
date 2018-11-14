import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


TestData data = findTestData('Test_Data')

WebUI.openBrowser('')

for (def index : (1..data.getRowNumbers() - 1)) {

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ai2upgrade.netforument.com/nfai2dev/eweb/DynamicPage.aspx?WebCode=LoginRequired&expires=yes&Site=demo')

WebUI.click(findTestObject('Object Repository/Page_Login Required/a_Register'))

WebUI.setText(findTestObject('Object Repository/Page_Have an Account Already/input_Email_C_2_1ValueTextBox0'),data.internallyGetValue(
            'EmailAddress', index))

WebUI.click(findTestObject('Object Repository/Page_Have an Account Already/input_Email_C_2_1ButtonFindGo'))

WebUI.click(findTestObject('Object Repository/Page_Account Status - Results/input_No matching result was f'))

WebUI.setText(findTestObject('Object Repository/Page_New Visitor Registration/input_First name_ind_first_nam'),  data.internallyGetValue(
            'GivenName', index))

WebUI.setText(findTestObject('Object Repository/Page_New Visitor Registration/input_Last name_ind_last_name'), data.internallyGetValue(
            'Surname', index))

WebUI.setText(findTestObject('Object Repository/Page_New Visitor Registration/input_Title_ixo_title'), 'ags')

WebUI.setText(findTestObject('Object Repository/Page_New Visitor Registration/input_Mailing address_adr_line'), '1425 Market ')

WebUI.setText(findTestObject('Object Repository/Page_New Visitor Registration/input_City_adr_city'), 'Denver')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_New Visitor Registration/select_Please selectAlaskaAlab'), 
    'CO', true)

WebUI.setText(findTestObject('Object Repository/Page_New Visitor Registration/input_ZIP code_adr_post_code'), '80202')

WebUI.setText(findTestObject('Object Repository/Page_New Visitor Registration/input_Phone_phn_number'), '303-298-6000')

WebUI.click(findTestObject('Object Repository/Page_New Visitor Registration/input_PatriciaWKingmailinator.'))

WebUI.setText(findTestObject('Object Repository/Page_New Visitor Registration/input_New password_cst_new_pas'), 
    'ai2')

WebUI.setText(findTestObject('Object Repository/Page_New Visitor Registration/input_Confirm password_cst_new'), 
    'ai2')

WebUI.click(findTestObject('Object Repository/Page_New Visitor Registration/input_Required_Bottom_2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_New Visitor Registration/input_Thank you for your regis'))

WebUI.closeBrowser()

}
