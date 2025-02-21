
#### Modifications from Original Code

1. **Improved User Feedback and Validation**
    - Added checks for null or empty usernames and passwords during user registration.
    - Enhanced feedback messages to guide users more effectively.

2. **Handled Edge Cases**
    - Ensured case-insensitivity for usernames to avoid duplication issues.
    - Added input validation for product details, ensuring no negative prices or quantities.

3. **Code Optimization and Cleanup**
    - Refactored redundant code into reusable methods to adhere to the DRY (Don't Repeat Yourself) principle.
    - Added methods `getIntInput` and `getDoubleInput` to handle numeric inputs and their validation.
    - Enhanced readability by organizing code into smaller, focused methods.

4**Improved User Experience**
    - Ensured continuous input prompts within each case statement for better user interaction.
    - Added a message upon exiting the application for a smoother user experience.

### Files and Code Structure

#### `Ecommerce.java`

**Modifications:**
- **User Management:**
    - Added validation for empty usernames and passwords.
    - Ensured case-insensitive checks for usernames.
- **Product Management:**
    - Added validation for product details (ID, name, price, quantity).
- **General:**
    - Improved feedback messages for better user guidance.

#### `Main.java`

**Modifications:**
- **Menu Presentation:**
    - Improved menu presentation and options for a clearer user interface.
- **Input Handling:**
    - Added methods `getIntInput` and `getDoubleInput` for better input validation.
    - Ensured continuous input prompts within each case statement.
- **User Interaction:**
    - Enhanced feedback and error messages for improved user experience.

#### `Product.java`

**Modifications:**
- **toString Method:**
    - Improved the `toString` method for better readability when listing products.

#### `User.java`

**Modifications:**
- **General:**
    - Added fields and methods to handle user login state and purchased products.
