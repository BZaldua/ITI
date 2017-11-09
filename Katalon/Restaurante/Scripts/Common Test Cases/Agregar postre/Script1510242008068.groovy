import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/wordpress/wp-login.php')

WebUI.setText(findTestObject('Page_Sterberks Kerfer  Log In (1)/input_log'), 'iti')

WebUI.setText(findTestObject('Page_Sterberks Kerfer  Log In (1)/input_pwd'), '123456789')

WebUI.click(findTestObject('Page_Sterberks Kerfer  Log In (1)/input_wp-submit'))

WebUI.click(findTestObject('Page_Escritorio  Sterberks Kerfer (1)/img'))

WebUI.click(findTestObject('Page_Menu Items  Sterberks Kerfer/a_Add New'))

WebUI.click(findTestObject('Page_Add New Menu Item  Sterberks K (1)/label_Introduce el ttulo aqu'))

WebUI.setText(findTestObject('Page_Add New Menu Item  Sterberks K (1)/input_post_title'), 'Tiramisu A')

WebUI.click(findTestObject('Page_Add New Menu Item  Sterberks K (1)/p'))

WebUI.click(findTestObject('Page_Add New Menu Item  Sterberks K (1)/div_wpcontent'))

WebUI.setText(findTestObject('Page_Add New Menu Item  Sterberks K (1)/input_nutritionalcaloriesval'), '125')

WebUI.setText(findTestObject('Page_Add New Menu Item  Sterberks K (1)/input_price'), '5')

WebUI.click(findTestObject('Page_Add New Menu Item  Sterberks K (1)/input_tax_inputmp_ingredient'))

WebUI.click(findTestObject('Page_Add New Menu Item  Sterberks K (1)/input_tax_inputmp_ingredient_1'))

WebUI.click(findTestObject('Page_Add New Menu Item  Sterberks K (1)/input_tax_inputmp_menu_categor'))

WebUI.click(findTestObject('Page_Add New Menu Item  Sterberks K (1)/input_publish'))

WebUI.closeBrowser()

