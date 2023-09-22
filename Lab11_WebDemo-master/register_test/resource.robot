*** Settings ***
Documentation     A resource file with reusable keywords and variables.
...
...               The system specific keywords created here form our own
...               domain specific language. They utilize keywords provided
...               by the imported SeleniumLibrary.
Library           SeleniumLibrary
*** Variables ***

${SERVER}         localhost:7272/Lab3
${REGISTRATION PAGE}    http://${SERVER}/Registration.html
${BROWSER}        Chrome

*** Keywords ***
Open Event Registration Page
    Open Browser    ${REGISTRATION PAGE}    chrome
    Maximize Browser Window
    Registration Page Should Be Open

Registration Page Should Be Open
    Location Should Be    ${REGISTRATION PAGE}
    Title Should Be    Event Registration

Input Firstname
    [Arguments]    ${firstname}
    Input Text    firstname    ${firstname}

Input Lastname
    [Arguments]    ${lastname}
    Input Text    lastname    ${lastname}

Input Organization
    [Arguments]    ${organization}
    Input Text    organization    ${organization}

Input Email
    [Arguments]    ${email}
    Input Text    email    ${email}

Input Phone
    [Arguments]    ${phone}
    Input Text    phone    ${phone}

Submit RegisterButton
    Click Button    registerButton



