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

WebUI.navigateToUrl('https://naanmudhalvan.tn.gov.in/')

WebUI.click(findTestObject('Object Repository/Page_Naan Mudhalvan Massive Upskilling Platform/button_X'))

WebUI.click(findTestObject('Object Repository/Page_Naan Mudhalvan Massive Upskilling Platform/div_X'))

WebUI.click(findTestObject('Object Repository/Page_Naan Mudhalvan Massive Upskilling Platform/button_X'))

WebUI.rightClick(findTestObject('Object Repository/Page_Naan Mudhalvan Massive Upskilling Platform/h1_Naan Mudhalvan Upskilling Platform'))

WebUI.click(findTestObject('Object Repository/Page_Naan Mudhalvan Massive Upskilling Platform/p_A massive industry relevant skill enhance_fd2a35'))

WebUI.rightClick(findTestObject('Object Repository/Page_Naan Mudhalvan Massive Upskilling Platform/a_Skill Offerings'))

WebUI.acceptAlert()

