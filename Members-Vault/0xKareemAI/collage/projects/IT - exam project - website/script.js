const form = document.getElementById("examForm");
const errorMessage = document.getElementById("error-message");
const successMessage = document.getElementById("success-message");

form.addEventListener("submit", function (event) {
  event.preventDefault();

  errorMessage.textContent = "";
  successMessage.textContent = "";

  const fullName = document.getElementById("fullName").value.trim();
  const email = document.getElementById("email").value.trim();
  const password = document.getElementById("password").value.trim();

  if (!fullName || !email || !password) {
    errorMessage.textContent = "Error: All fields are required.";
    return;
  }

  if (!email.endsWith("@azhar.adu.eg")) {
    errorMessage.textContent = "Error: Email must end with @azhar.adu.eg";
    return;
  }

  if (password.length < 8) {
    errorMessage.textContent =
      "Error: Password must be at least 8 characters long.";
    return;
  }

  successMessage.textContent = "Success! Form submitted correctly.";
  form.reset();
});
