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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cloudtest.fitbulut.com/#/kullanici/giris')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Foriba Bulut Portal/input_e-Posta_inputEmail3'), 'okay.mardin@fitcons.com')

WebUI.setText(findTestObject('Object Repository/Page_Foriba Bulut Portal/input_ifre_txtPassword'), 'uAB4vLZ:')

WebUI.click(findTestObject('Object Repository/Page_Foriba Bulut Portal/div_Giri'))

WebUI.waitForJQueryLoad(10)


WebUI.click(findTestObject('Page_Foriba Bulut Portal/pop-up'))

WebUI.click(findTestObject('Page_Foriba Bulut Portal/span_e-Fatura'))

WebUI.click(findTestObject('Object Repository/Page_Foriba Bulut Portal/span_Gelen Fatura'))

WebUI.waitForJQueryLoad(10)

if (!(WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Foriba Bulut Portal/span_1 Ay')))) {
    WebUI.delay(10)
}

WebUI.click(findTestObject('Object Repository/Page_Foriba Bulut Portal/span_1 Ay'))

WebUI.click(findTestObject('Object Repository/Page_Foriba Bulut Portal/span_IN02018000000197'))

WebUI.click(findTestObject('Object Repository/Page_Foriba Bulut Portal/button_Detay'))

WebUI.verifyElementText(findTestObject('Page_Foriba Bulut Portal/div_urnmaildefaultpkfitcons.com'), 'urn:mail:defaultpk@fitcons.com')

WebUI.delay(10)

WebUI.closeBrowser()

