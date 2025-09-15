*** Comments ***
Name : ยศภัทร สองเมือง
Student_ID : 663380230-6
Section : 1

*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${CHROME_BROWSER_PATH}    ${EXECDIR}${/}../ChromeForTesting${/}chrome.exe
${CHROME_DRIVER_PATH}    ${EXECDIR}${/}../ChromeForTesting${/}chromedriver.exe
${URL}    http://localhost:7272/Lab10/Registration.html
${URL_2}    http://localhost:7272/Lab3/Registration.html
${First_Name}       Somsri
${Last_Name}        Sodsai
${Organization}     CS KKU
${Email}            somsri@kkumail.com
${Phone_No}         081-001-1234

*** Keywords ***
OpenChrome
    ${chrome_options}    Evaluate    sys.modules['selenium.webdriver'].ChromeOptions()    sys
    ${chrome_options.binary_location}    Set Variable    ${CHROME_BROWSER_PATH}
    ${service}    Evaluate    sys.modules["selenium.webdriver.chrome.service"].Service(executable_path=r"${CHROME_DRIVER_PATH}")
    Create Webdriver    Chrome    options=${chrome_options}    service=${service}
    Set Selenium Speed  0.05

*** Test Cases ***
TC001-1
    OpenChrome
    Go To    ${URL}
    Page Should Contain    Event Registration
    Close Browser

TC001-2
    OpenChrome
    Go To    ${URL}
    Page Should Contain    Event Registration
    Input Text    id=firstname      ${First_Name}
    Input Text    id=lastname       ${Last_Name}
    Input Text    id=organization   ${Organization}
    Input Text    id=email          ${Email}
    Input Text    id=phone          ${Phone_No}
    Click Button  id=registerButton
    Page Should Contain    Success
    Close Browser

TC002-1
    OpenChrome
    Go To    ${URL_2}
    Page Should Contain    Event Registration
    Close Browser

TC002-2
    OpenChrome
    Go To    ${URL_2}
    Page Should Contain    Event Registration
    Input Text    id=firstname      ${First_Name}
    Input Text    id=lastname       ${Last_Name}
    Input Text    id=email          ${Email}
    Input Text    id=phone          ${Phone_No}
    Click Button  id=registerButton
    Page Should Contain    Success
    Close Browser