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

Mobile.startExistingApplication('surplus.surplus_apps_customer')

Mobile.tap(findTestObject('Application/Surplus/android.view.ViewGroup - Section Pilih Kategori'), 0)

Mobile.tap(findTestObject('Application/Surplus/android.view.ViewGroup - List makanan'), 0)

Mobile.tap(findTestObject('Application/Surplus/android.view.ViewGroup Button Tambah Ke Keranjang'), 0)

Mobile.tap(findTestObject('Application/Surplus/android.view.ViewGroup Button Tambah'), 0)

Mobile.tap(findTestObject('Application/Surplus/android.view.ViewGroup Button Konfirmasi Pesanan'), 0)

Mobile.tap(findTestObject('Application/Surplus/android.view.ViewGroup Button Pilih Jam Pengambilan'), 0)

Mobile.tap(findTestObject('Application/Surplus/android.view.ViewGroup Button Set Jam'), 0)

Mobile.tap(findTestObject('Application/Surplus/Button OKE'), 0)

Mobile.setText(findTestObject('Application/Surplus/android.view.ViewGroup - List makanan'), 'nagashias21', 0)

Mobile.setText(findTestObject('Object Repository/Application/android.widget.EditText - FieldKataSandiPageFormLogin'), 'naga1234', 
    0)

Mobile.tap(findTestObject('Object Repository/Application/android.widget.TextView - BtnMasukPageFormLogin'), 0)

Mobile.tap(findTestObject('Application/android.widget.TextView - BtnTutupPopupSetNotifikasi'), 0)

Mobile.tap(findTestObject('Application/android.widget.ImageView - BtnNavbarProfile'), 0)

Mobile.tap(findTestObject('Application/android.widget.Button BtnThreedotOwnPageProfile'), 0)

Mobile.tap(findTestObject('Application/android.widget.TextView - BtnKeluarPagePengaturan'), 0)

Mobile.tap(findTestObject('Application/android.widget.TextView - BtnYaKeluarPopUpKonfirmasiLogout'), 0)

Mobile.tap(findTestObject('Application/android.widget.LinearLayout BtnLoginWithGooglePageLandingScreen'), 0)

Mobile.tap(findTestObject('Application/android.widget.LinearLayout BtnChooseAkunGoogle'), 0)

Mobile.tap(findTestObject('Application/android.widget.TextView - BtnTutupPopupSetNotifikasi'), 0)

Mobile.tap(findTestObject('Application/android.widget.ImageView - BtnNavbarProfile'), 0)

Mobile.tap(findTestObject('Application/android.widget.Button BtnThreedotOwnPageProfile'), 0)

Mobile.tap(findTestObject('Application/android.widget.TextView - BtnKeluarPagePengaturan'), 0)

Mobile.tap(findTestObject('Application/android.widget.TextView - BtnYaKeluarPopUpKonfirmasiLogout'), 0)

Mobile.closeApplication()

