// Course Enrollment for Student
document.getElementById('enrollment-form').addEventListener('submit', function (e) {
    e.preventDefault();

    const course = document.getElementById('course-select').value;

    // Simulate course enrollment
    const message = `Successfully enrolled in "${course}"!`;
    document.getElementById('enrollment-message').textContent = message;

    // Clear form
    this.reset();
});

// Assignment Submission for Student
document.getElementById('submission-form').addEventListener('submit', function (e) {
    e.preventDefault();

    const file = document.getElementById('assignment-upload').files[0];

    // Simulate file upload
    const message = `Assignment "${file.name}" successfully submitted!`;
    document.getElementById('submission-message').textContent = message;

    // Clear form
    this.reset();
});
