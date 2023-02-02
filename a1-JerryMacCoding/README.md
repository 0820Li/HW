# A1 - Piraten Karpen

  * Author: < You name here >
  * Email: < Your email here >

## Build and Execution

  * To clean your working directory:
    * `mvn clean`
  * To compile the project:
    * `mvn compile`
  * To run the project in development mode:
    * `mvn -q exec:java` (here, `-q` tells maven to be _quiet_)
  * To package the project as a turn-key artefact:
    * `mvn package`
  * To run the packaged delivery:
    * `java -jar target/piraten-karpen-jar-with-dependencies.jar` 

Remark: **We are assuming here you are using a _real_ shell (e.g., anything but PowerShell on Windows)**

## Feature Backlog

 * Status: 
   * Pending (P), Started (S), Blocked (B), Done (D)
 * Definition of Done (DoD):
     A feature is considered done and delivered for good when the following criteria are met:
1. Code has been written, tested, and reviewed to meet the requirements of the feature.
2. Unit tests have been written and passed for the feature.
3. The feature has been integrated with the rest of the system and tested as a whole.
4. The feature has been documented and any necessary updates to the README.md file have been made.
5. The feature has been demonstrated to stakeholders and received their approval.

### Backlog 

| MVP? | Id  | Feature  | Status  |  Started  | Delivered |
| :-:  |:-:  |---       | :-:     | :-:       | :-:       |
| x   | F01 | Roll a dice |  S | 01/01/23 |  |
| x   | F02 | Roll eight dices  |  B (F01) |   |
| x   | F03 | Select how many games as command-line arg.  |  P  |   |
| x   | F04 | end of game with three cranes | P | |
| x   | F05 | Player keeping random dice at their turn | B (F02) | | 
| x   | F06 | Score points: 3-of-a-kind | B (F04) | | 
| ... | ... | ... |

