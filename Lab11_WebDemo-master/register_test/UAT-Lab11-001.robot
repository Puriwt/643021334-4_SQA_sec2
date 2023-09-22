*** Settings ***
Library   SeleniumLibrary
Resource    resource.robot

*** Variables ***
${EXPECT H1}    Success
${EXPECT H2}    Thank you for participating in our event
${SUCCESS PAGE}    http://${SERVER}/Success.html?firstname=Somsri&lastname=Sodsai&organization=CS+KKU&email=somsri%40kkumail.com&phone=081-001-1234
${SUCCESS PAGE NON-ORG}    http://${SERVER}/Success.html?firstname=Somsri&lastname=Sodsai&organization=&email=somsri%40kkumail.com&phone=081-001-1234
${DELAY}    0.5s   

*** Test Cases ***

Register Success
    Open Event Registration Page
    Input Firstname  Somsri
    Input Lastname   Sodsai
    Input Organization    CS KKU
    Input Email    somsri@kkumail.com
    Input Phone    081-001-1234
    Sleep   1s
    Submit RegisterButton
    Sleep   1s
    Success Page Should Be Open
    [Teardown]    Close Browser


Register Success Non-Organizationd
    Open Event Registration Page
    Input Firstname  Somsri
    Input Lastname   Sodsai
    Input Email    somsri@kkumail.com
    Input Phone    081-001-1234
    Sleep   1s
    Submit RegisterButton
    Sleep   1s
    Success Page Should Be Open Non-Organization
    [Teardown]    Close Browser

*** Keywords ***
Success Page Should Be Open
    Location Should Be    ${SUCCESS PAGE}
    Title Should Be    Success
    ${result}    Get Text    xpath=//h1
    Should Be Equal    ${result}    ${EXPECT H1}
    ${result}    Get Text    xpath=//h2
    Should Be Equal    ${result}    ${EXPECT H2}

Success Page Should Be Open Non-Organization
    Location Should Be    ${SUCCESS PAGE NON-ORG}
    Title Should Be    Success
    ${result}    Get Text    xpath=//h1
    Should Be Equal    ${result}    ${EXPECT H1}
    ${result}    Get Text    xpath=//h2
    Should Be Equal    ${result}    ${EXPECT H2}
   

