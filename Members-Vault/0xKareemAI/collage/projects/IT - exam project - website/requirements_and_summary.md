# IT Lab Exam: Project Requirements & Implementation Summary

## 📋 Task Requirements (from Lab Exam.pdf)

### 1. Website Structure
- [x] Create at least **3 pages** (Home, About, Contact).
- [x] Connect pages using a **navigation bar (navbar)**.

### 2. HTML Requirements
- [x] **Headings**: Use hierarchy from `<h1>` to `<h6>`.
- [x] **Paragraphs**: For text content.
- [x] **Images**: Inclusion of visual assets.
- [x] **Links**: Both internal (between pages) and external (to other websites).
- [x] **Lists**:
    - [x] Ordered List (`<ol>`)
    - [x] Unordered List (`<ul>`)
- [x] **Tables**: For structured data display.
- [x] **Forms**:
    - [x] Input fields (text, email, password).
    - [x] Labels for accessibility.
    - [x] Submit button.

### 3. CSS Requirements
- [x] **CSS Implementation Methods**:
    - [x] Inline CSS
    - [x] Internal CSS (within `<style>` tags)
    - [x] External CSS (separate `.css` file)
- [x] **CSS Selectors**:
    - [x] Tag selector
    - [x] Class selector
    - [x] ID selector
- [x] **Styling Elements**: Colors, Fonts, Spacing (margin/padding), Borders, Navbar styling, and Background color.

### 4. JavaScript Requirements
- [x] **Form Validation**:
    - [x] Check for required fields.
    - [x] Validate email format (must end with `@azhar.adu.eg`).
    - [x] Password length check (minimum 8 characters).

### 5. Design Requirements
- [x] Clean and organized layout.
- [x] Easy navigation.
- [x] Consistent design across all pages.

---

## 🚀 Implementation Summary (What We Did)

We have successfully developed a fully functional, responsive, and visually appealing multi-page website that meets all the specified exam requirements.

### 📁 Project Structure
- `index.html`: The landing page showcasing the primary heading hierarchy and key features.
- `about.html`: Contains the project objectives, an **Ordered List**, and a **Table** for the project schedule.
- `contact.html`: Features the **Contact Form** and integrates the validation logic.
- `style.css`: The external stylesheet providing the core design system.
- `script.js`: The JavaScript logic for real-time form validation.
- `assets/`: Directory containing the university logo.

### 🛠️ Key Technical Implementations
1.  **Multi-Page Navigation**: A consistent navbar was implemented across all pages using semantic `<nav>` elements, ensuring easy transitions between Home, About, and Contact.
2.  **Rich HTML5 Usage**: 
    - Used all heading levels (`h1`-`h6`) in `index.html`.
    - Implemented a data table in `about.html` with `thead` and `tbody`.
    - Added an external link to the university website and internal links for site navigation.
3.  **Comprehensive CSS Styling**:
    - **External**: Used for global layout, Google Fonts integration (`Outfit`), and consistent spacing.
    - **Internal**: Used in `about.html` to style the "Project Schedule" table specifically.
    - **Inline**: Applied to specific elements like the university logo and the contact section header for immediate visual adjustments.
4.  **JavaScript Validation**:
    - The validation script prevents form submission if fields are empty.
    - It enforces the specific domain constraint (`@azhar.adu.eg`) for the email field.
    - It validates that the password is at least 8 characters long, providing clear error/success messages to the user.
5.  **Modern Aesthetics**: The design uses a premium color palette (Midnight Blue, Crimson, Gold) with smooth gradients, shadows, and clean typography to provide a professional user experience.
