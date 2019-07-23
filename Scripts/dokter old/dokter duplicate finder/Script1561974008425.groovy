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

WebUI.navigateToUrl('https://www.sehatq.com/dokter')

WebUI.waitForPageLoad(30)

WebUI.comment(WebUI.getText(findTestObject('dokter old/Page_SehatQ - Cari dokter/b_584'), FailureHandling.CONTINUE_ON_FAILURE))

def testArray = ['dr. Adam Bachtiar Satibi, Sp.OG','dr. Cindy Ariani','dr. Yovi Kurniawati, Sp.JP','Prof. Dr. dr. Bambang Budi Siswanto, Sp.JP(K)']

while (WebUI.verifyElementPresent(findTestObject('dokter old/Page_SehatQ - Cari dokter/a_Next'), 0, FailureHandling.OPTIONAL) ==
	true) {
	for (int i = 1; i < 11; i++) {
	   
		testArray += WebUI.getText(findTestObject('dokter old/Page_SehatQ - Cari dokter/a_dokter name ' + i), FailureHandling.CONTINUE_ON_FAILURE)
	
	}
	WebUI.click(findTestObject('dokter old/Page_SehatQ - Cari dokter/a_Next'))

	WebUI.waitForPageLoad(30)

	WebUI.comment(WebUI.getUrl())
}
	
	WebUI.closeBrowser()
	
	def d = testArray.findAll{testArray.count(it) > 1}.unique()
	
	for (int x = 0; x <d.size ; x++) {
	WebUI.comment(d[x])}
