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
    Input Text    id=lastname       ${Last_Name}
    Input Text    id=organization   ${Organization}
    Input Text    id=email          ${Email}
    Input Text    id=phone          ${Phone_No}
    Click Button  id=registerButton
    Wait Until Element Is Visible    id=errors    3s
    Element Should Contain    id=errors    Please enter your first name!!
    Close Browser

TC002-1
    OpenChrome
    Go To    ${URL}
    Page Should Contain    Event Registration
    Close Browser

TC002-2
    OpenChrome
    Go To    ${URL}
    Page Should Contain    Event Registration
    Input Text    id=firstname      ${First_Name}
    Input Text    id=organization   ${Organization}
    Input Text    id=email          ${Email}
    Input Text    id=phone          ${Phone_No}
    Click Button  id=registerButton
    Wait Until Element Is Visible    id=errors    3s
    Element Should Contain    id=errors    Please enter your last name!!
    Close Browser

TC003-1
    OpenChrome
    Go To    ${URL}
    Page Should Contain    Event Registration
    Close Browser

TC003-2
    OpenChrome
    Go To    ${URL}
    Page Should Contain    Event Registration
    Input Text    id=organization   ${Organization}
    Input Text    id=email          ${Email}
    Input Text    id=phone          ${Phone_No}
    Click Button  id=registerButton
    Wait Until Element Is Visible    id=errors    3s
    Element Should Contain    id=errors    Please enter your name!!
    Close Browser

TC003-3
    OpenChrome
    Go To    ${URL}
    Page Should Contain    Event Registration
    Input Text    id=firstname      ${First_Name}
    Input Text    id=lastname       ${Last_Name}
    Input Text    id=organization   ${Organization}
    Input Text    id=phone          ${Phone_No}
    Click Button  id=registerButton
    Wait Until Element Is Visible    id=errors    3s
    Element Should Contain    id=errors    Please enter your email!!
    Close Browser

TC004-1
    OpenChrome
    Go To    ${URL}
    Page Should Contain    Event Registration
    Close Browser

TC004-2
    OpenChrome
    Go To    ${URL}
    Page Should Contain    Event Registration
    Input Text    id=firstname      ${First_Name}
    Input Text    id=lastname       ${Last_Name}
    Input Text    id=organization   ${Organization}
    Input Text    id=email          ${Email}
    Click Button  id=registerButton
    Wait Until Element Is Visible    id=errors    3s
    Element Should Contain    id=errors    Please enter your phone number!!
    Close Browser

TC005-1
    OpenChrome
    Go To    ${URL}
    Page Should Contain    Event Registration
    Close Browser

TC005-2
    OpenChrome
    Go To    ${URL}
    Page Should Contain    Event Registration
    Input Text    id=firstname      ${First_Name}
    Input Text    id=lastname       ${Last_Name}
    Input Text    id=organization   ${Organization}
    Input Text    id=email          ${Email}
    Input Text    id=phone          1234
    Click Button  id=registerButton
    Wait Until Element Is Visible    id=errors    3s
    Element Should Contain    id=errors    Please enter a valid phone number, e.g., 081-234-5678, 081 234 5678, or 081.234.5678
    Close Browser