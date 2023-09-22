*** Settings ***
Library   SeleniumLibrary
Resource    resource.robot

*** Variables ***
${EMPLY FNAME}    Please enter your first name!!
${EMPLY LNAME}    Please enter your last name!!
${EMPLY F&L NAME}    Please enter your name!!
${EMPLY EMAIL}    Please enter your email!!
${EMPLY PHONE}    Please enter your phone number!!
${INVALID PHONE}    Please enter a valid phone number, e.g., 081- 234-5678, 081 234 5678, or 081.234.5678
${DELAY}    0s
${EMPTY}    

*** Test Cases ***

Empty First Name
    Open Event Registration Page
    Input Firstname    ${EMPTY}
    Input Lastname   Sodsai
    Input Organization    CS KKU
    Input Email    somsri@kkumail.com
    Input Phone    081-001-1234
    Sleep   ${DELAY}
    Submit RegisterButton
    Sleep   ${DELAY}
    Open Page Fail Frist Name
    Sleep   ${DELAY}
    [Teardown]    Close Browser



Empty Last Name
    Open Event Registration Page
    Input Firstname  Somsri
    Input Lastname   ${EMPTY}
    Input Organization    CS KKU
    Input Email    somsri@kkumail.com
    Input Phone    081-001-1234
    Sleep   ${DELAY}
    Submit RegisterButton
    Sleep   ${DELAY}
    Open Page Fail Last Name
    Sleep   ${DELAY}
    [Teardown]    Close Browser


Empty First Name and Last Name
    Open Event Registration Page
    Input Firstname  ${EMPTY}
    Input Lastname   ${EMPTY}
    Input Organization    CS KKU
    Input Email    somsri@kkumail.com
    Input Phone    081-001-1234
    Sleep   ${DELAY}
    Submit RegisterButton
    Sleep   ${DELAY}
    Open Page Fail F&L Name
    Sleep   ${DELAY}
    [Teardown]    Close Browser



Empty Email
    Open Event Registration Page
    Input Firstname  Somsri
    Input Lastname   Sodsai
    Input Organization    CS KKU
    Input Email    ${EMPTY}
    Input Phone    081-001-1234
    Sleep   ${DELAY}
    Submit RegisterButton
    Sleep   ${DELAY}
    Open Page Fail Email
    Sleep   ${DELAY}
    [Teardown]    Close Browser


Empty Phone Number
    Open Event Registration Page
    Input Firstname  Somsri
    Input Lastname   Sodsai
    Input Organization    CS KKU
    Input Email    somsri@kkumail.com
    Input Phone    ${EMPTY}
    Sleep   ${DELAY}
    Submit RegisterButton
    Sleep   ${DELAY}
    Open Page Fail Phone
    Sleep   ${DELAY}
    [Teardown]    Close Browser

Invalid Phone Number
    Open Event Registration Page
    Input Firstname  Somsri
    Input Lastname   Sodsai
    Input Organization    CS KKU
    Input Email    somsri@kkumail.com
    Input Phone    1234
    Sleep   ${DELAY}
    Submit RegisterButton
    Sleep   ${DELAY}
    Open Page Fail Invalid Phone
    Sleep   ${DELAY}
    [Teardown]    Close Browser

*** Keywords ***
Open Page Fail Frist Name
    Registration Page Should Be Open
    Element Should Contain  errors  ${EMPLY FNAME}

Open Page Fail Last Name
    Registration Page Should Be Open
    Element Should Contain  errors  ${EMPLY LNAME}

Open Page Fail F&L Name
    Registration Page Should Be Open
    Element Should Contain  errors  ${EMPLY F&L NAME}

Open Page Fail Email
    Registration Page Should Be Open
    Element Should Contain  errors  ${EMPLY EMAIL}

Open Page Fail Phone
    Registration Page Should Be Open
    Element Should Contain  errors  ${EMPLY PHONE}

Open Page Fail Invalid Phone
    Registration Page Should Be Open
    Element Should Contain  errors  ${INVALID PHONE}