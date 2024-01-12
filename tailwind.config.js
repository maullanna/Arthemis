/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["index.html", "login.html"],
  darkMode: "class",
  theme: {
    extend: {
      colors: {
        primary: "#10b981",
        secondary: "#64748b",
        dark: "#020617",
        orange: "#ea580c",
      },
    },
  },
  plugins: [],
};
