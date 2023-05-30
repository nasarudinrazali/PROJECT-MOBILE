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

titleName = 'Checklist Title'

Mobile.startExistingApplication('com.socialnmobile.dictapps.notepad.color.note')

Mobile.tap(findTestObject('ColorNote/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/ColorNote/android.widget.TextView - Checklist (1)'), 0)

'titleName is driven from Groovy variable\r\n'
Mobile.setText(findTestObject('Object Repository/ColorNote/android.widget.EditText (2)'), titleName, 0)

Mobile.tap(findTestObject('Object Repository/ColorNote/android.widget.LinearLayout (1)'), 0)

'itemNameOne is driven from test case variable\r\n'
Mobile.setText(findTestObject('Object Repository/ColorNote/android.widget.EditText (3)'), itemNameOne, 0)

Mobile.tap(findTestObject('Object Repository/ColorNote/android.widget.Button - OK (1)'), 0)

Mobile.tap(findTestObject('Object Repository/ColorNote/android.widget.LinearLayout (2)'), 0)

'itemNameTwo is driven from test case variable\r\n'
Mobile.setText(findTestObject('ColorNote/android.widget.EditText (3)'), itemNameTwo, 0)

Mobile.tap(findTestObject('ColorNote/android.widget.Button - OK (1)'), 0)

Mobile.pressBack()

itemA = Mobile.getText(findTestObject('ColorNote/android.widget.TextView - Item A', [('param') : itemNameOne]), 0)

itemB = Mobile.getText(findTestObject('ColorNote/android.widget.TextView - Item B', [('param') : itemNameTwo]), 0)

Mobile.verifyMatch(itemA, itemNameOne, false)

Mobile.verifyMatch(itemB, itemNameTwo, false)

Mobile.pressBack()

title = Mobile.getText(findTestObject('ColorNote/android.widget.TextView - Checklist Title'), 0)

Mobile.verifyMatch(title, 'Checklist Title', false)

Mobile.closeApplication()

