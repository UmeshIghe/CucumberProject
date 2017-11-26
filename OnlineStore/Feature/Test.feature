Feature: Login Feature

  @tagtest
  Scenario: Sucessful login
    Given user opens gmail login page with url "https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin"
    Given User login with invalid "umeshIghe" and "12354"

    Then error message "Wrong password. Try again or click Forgot password to reset it." should be display
