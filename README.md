# Java IV Spring Boot Lab

In this lab, you will learn how to externalize properties in a Spring Boot application

## Objectives

1. Configure a minimal ``pom.xml`` with the latest Spring Boot parent pom, and
two artifacts: ``spring-boot-starter`` and ``spring-boot-starter-test``
1. Add just enough code to get all tests in both files under ``src/test/java/edu/cscc/java4/sbootlab``
to run successfully

## Getting Started:

1. Copy the starter code from here into a new, private repository in your personal GitHub account using [these instructions](https://github.com/jeff-anderson-cscc/submitting-assignments-lab#copy-the-starter-code-into-a-new-private-repository-in-your-personal-github-account) substituting this repository URL ``https://github.com/jeff-anderson-cscc/java4-labs-spring-boot.git`` for the one referenced in that document
2. Create a new branch for your code changes as described in [these instructions](https://github.com/jeff-anderson-cscc/submitting-assignments-lab#before-you-start-coding)

## Completing the Assignment

__Important:__ you may not change the code in any test cases. _The only permissible difference between the base version of each JUnit test class and yours is yours will have no tests commented out and the file is otherwise identical._

1. In the ``pom.xml``, add the latest Spring Boot parent pom and
two dependencies: ``spring-boot-starter`` and ``spring-boot-starter-test``
1. Starting with ``edu.cscc.java4.sbootlab.SpringAppTests``:
    1. get the first test to pass
    1. One by one, get the next test to pass
1. Once SpringAppTests is completely working, repeat the steps above with ``edu.cscc.java4.sbootlab.SpringAppDevProfileTests``

### Hints from the documentation:

* [13.2.1 Inheriting the Starter Parent](13.2.1 Inheriting the Starter Parent)
* [13.5 Starters](https://docs.spring.io/spring-boot/docs/2.1.3.RELEASE/reference/htmlsingle/#using-boot-starter)
* [18. Using the @SpringBootApplication Annotation](https://docs.spring.io/spring-boot/docs/2.1.3.RELEASE/reference/htmlsingle/#using-boot-using-springbootapplication-annotation)
* [24. Externalized Configuration](https://docs.spring.io/spring-boot/docs/2.1.3.RELEASE/reference/htmlsingle/#boot-features-external-config)
* [24.3 Application Property Files](https://docs.spring.io/spring-boot/docs/2.1.3.RELEASE/reference/htmlsingle/#boot-features-external-config-application-property-files)
* [24.4 Profile-specific Properties](https://docs.spring.io/spring-boot/docs/2.1.3.RELEASE/reference/htmlsingle/#boot-features-external-config-profile-specific-properties)
* [24.8 Type-safe Configuration Properties](https://docs.spring.io/spring-boot/docs/2.1.3.RELEASE/reference/htmlsingle/#boot-features-external-config-typesafe-configuration-properties)

## Submitting your work

1. Create a pull request for your branch using [these instructions](https://github.com/jeff-anderson-cscc/submitting-assignments-lab#once-you-are-ready-to-submit-your-work-for-grading)
1. Submit the assignment in Blackboard as described in [these instructions](https://github.com/jeff-anderson-cscc/submitting-assignments-lab#once-your-pull-request-is-created-and-i-am-added-as-a-reviewer)

__NOTE: I will provide feedback via. comments in your pull request.__
If you need to amend your work after you issue your initial pull request:

1. Commit your updates
1. Push your changes to gitHub
1. Verify the new commits were automatically added to your open pull request
