# CLetter Application

## Overview
CLetter is a JavaFX-based desktop application that enables users to generate customized, template-based cover letters using basic input data. It streamlines the creation process by dynamically incorporating user-specified information into pre-designed templates, producing aesthetically formatted HTML and PDF outputs.

## Features
- **Dynamic Data Integration**: Generate personalized cover letters based on user-provided details such as company name, job qualities, and company focus.
- **HTML and PDF Outputs**: Automatically creates a formatted HTML file and converts it into a professional PDF document.
- **Interactive UI**: Utilizes JavaFX for an intuitive user experience.
- **Template System**: Supports pre-defined HTML templates for consistent styling.

## Prerequisites
- Java 11 or later.
- Apache Commons IO library.
- iText library for HTML-to-PDF conversion.

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/cletter.git
   ```
2. Open the project in your preferred IDE (e.g., IntelliJ, Eclipse).
3. Ensure the required dependencies (`commons-io` and `iText`) are included in the project.

## Usage
### Running the Application
1. Launch the `CLetterApplication` class.
   ```bash
   java -cp target/classes com.example.cletter.CLetterApplication
   ```
2. Fill out the fields in the application interface:
   - **Company Name**: Name of the target company.
   - **Current Date**: Date for the cover letter.
   - **Company Focus**: The company's main area of focus.
   - **Qualities**: Two characteristics relevant to the job listing.
   - **Small Group Collaboration**: Indicate whether the job involves teamwork.
3. Click the `Generate` button to produce the cover letter.

### Output Files
- HTML Template: `output.html`
- PDF Cover Letter: `JACOB_ZEIGLER_<COMPANY_NAME>_COVER_LETTER.pdf`

These files are saved in the specified resources directory.

## Project Structure
- `CLetterApplication.java`: Initializes and launches the JavaFX application.
- `CLetterController.java`: Implements the backend functionality for dynamic data processing and file generation.
- `template.html`: The base template for the cover letter.
- `output.html`: The generated HTML cover letter.
- PDF output: Generated in the resources directory.

## Key Libraries
- **JavaFX**: For creating the user interface.
- **Apache Commons IO**: For file reading and writing.
- **iText**: For converting HTML to PDF.

## Example Workflow
1. Input company name: `TechCorp`.
2. Select qualities: `creative`, `flexible`.
3. Click `Generate`.
4. Result:
   - An HTML file formatted with the input data.
   - A PDF cover letter titled `JACOB_ZEIGLER_TECHCORP_COVER_LETTER.pdf`.


