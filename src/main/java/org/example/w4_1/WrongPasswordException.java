package org.example.w4_1;

public class WrongPasswordException  extends Exception {

        public WrongPasswordException() {
        }
        public WrongPasswordException(String message) {
          super(message);
        }

}
