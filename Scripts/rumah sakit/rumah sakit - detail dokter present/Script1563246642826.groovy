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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.target+'sehatq.com/faskes/rumah-sakit-abdi-waluyo')

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('rumah sakit/detail dokter present/buat janji button'), 5)

WebUI.verifyElementPresent(findTestObject('rumah sakit/detail dokter present/dokter head navigation'), 5)

WebUI.verifyElementPresent(findTestObject('rumah sakit/detail dokter present/dokter section header'), 5)

WebUI.click(findTestObject('rumah sakit/detail dokter present/dokter by spesialisasi'))

WebUI.verifyElementPresent(findTestObject('rumah sakit/detail dokter present/dokter name'), 5)

WebUI.verifyElementPresent(findTestObject('rumah sakit/detail dokter present/dokter schedule'), 5)

WebUI.closeBrowser()

