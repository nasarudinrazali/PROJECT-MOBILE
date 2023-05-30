import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class SearchforWords {

	@Given("I open ColorNoteApp")
	public void i_open_ColorNoteApp() {

		Mobile.startExistingApplication('com.socialnmobile.dictapps.notepad.color.note')
	}

	@When("I tap Search button")
	public void i_tap_Search_button() {

		Mobile.tap(findTestObject('ColorNote/android.widget.SearchTab'), 0)
	}


	@When("I type wordOne (.*)")
	public void i_type_wordOne(String wordOne) {
		Mobile.setText(findTestObject('ColorNote/android.widget.EditText - Search'), wordOne, 0)
	}

	@Then("I am able to view the (.*) result")
	public void i_am_able_to_view_the_resultS(String wordOne) {

		Mobile.verifyElementVisible(findTestObject('ColorNote/android.widget.TextView - Checklist Title (1)', [('titleParam') : wordOne]), 0)
		Mobile.tap(findTestObject('ColorNote/android.widget.ClearTextButton'), 0, FailureHandling.STOP_ON_FAILURE)
		Mobile.closeApplication()
	}

	@When("I view the first (.*) result")
	public void i_view_the_first_result(String wordOne) {

		Mobile.verifyElementVisible(findTestObject('ColorNote/android.widget.TextView - Checklist Title (1)', [('titleParam') : wordOne]), 0)
	}

	@When("I clear text")
	public void i_clear_text() {

		Mobile.tap(findTestObject('ColorNote/android.widget.ClearTextButton'), 0, FailureHandling.STOP_ON_FAILURE)
	}

	@When("I type wordTwo (.*)")
	public void i_type_wordTwo(String wordTwo) {
		Mobile.setText(findTestObject('ColorNote/android.widget.EditText - Search'), wordTwo, 0)
	}

	@Then("I am able to view second (.*) result")
	public void i_am_able_to_view_second_result(String wordTwo) {

		Mobile.verifyElementVisible(findTestObject('ColorNote/android.widget.TextView - Checklist Title (1)', [('titleParam') : wordTwo]), 0)
		Mobile.tap(findTestObject('ColorNote/android.widget.ClearTextButton'), 0, FailureHandling.STOP_ON_FAILURE)
		Mobile.closeApplication()
	}
}