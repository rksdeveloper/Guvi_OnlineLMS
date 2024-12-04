// Quiz Creation for Instructor
document.getElementById('quiz-form').addEventListener('submit', function (e) {
    e.preventDefault();

    const quizTitle = document.getElementById('quiz-title').value;
    const quizQuestions = document.getElementById('quiz-questions').value;

    // Simulate quiz creation
    const message = `Quiz "${quizTitle}" successfully created!`;
    document.getElementById('quiz-message').textContent = message;

    // Clear form
    this.reset();
});

// Assignment Management for Instructor
document.getElementById('assignment-form').addEventListener('submit', function (e) {
    e.preventDefault();

    const assignmentTitle = document.getElementById('assignment-title').value;
    const assignmentDescription = document.getElementById('assignment-description').value;

    // Simulate assignment creation
    const message = `Assignment "${assignmentTitle}" successfully created!`;
    document.getElementById('assignment-message').textContent = message;

    // Clear form
    this.reset();
});