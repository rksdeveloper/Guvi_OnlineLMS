// User Management for Admin
document.getElementById('user-management-form').addEventListener('submit', function (e) {
    e.preventDefault();

    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const role = document.getElementById('role').value;

    // Simulate server interaction
    const message = `User ${name} (${role}) successfully created!`;
    document.getElementById('user-message').textContent = message;

    // Clear form
    this.reset();
});

// Course Management for Admin
document.getElementById('course-management-form').addEventListener('submit', function (e) {
    e.preventDefault();

    const title = document.getElementById('course-title').value;
    const description = document.getElementById('course-description').value;

    // Simulate course creation
    const message = `Course "${title}" successfully created!`;
    document.getElementById('course-message').textContent = message;

    // Clear form
    this.reset();
});