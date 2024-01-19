document.addEventListener("DOMContentLoaded", function () {
  var myCarousel = new bootstrap.Carousel(document.getElementById("carouselExampleIndicators"), {
    interval: 5000,
    pause: "hover",
  });

  document.querySelector(".carousel-control-prev").addEventListener("click", function () {
    myCarousel.prev();
  });

  document.querySelector(".carousel-control-next").addEventListener("click", function () {
    myCarousel.next();
  });
});

// scripts.js
document.addEventListener("DOMContentLoaded", function () {
  const imageContainer = document.querySelector(".image-container");
  const slides = document.querySelectorAll(".slide");
  const prevBtn = document.getElementById("prevBtn");
  const nextBtn = document.getElementById("nextBtn");

  let currentIndex = 0;

  nextBtn.addEventListener("click", function () {
    currentIndex = (currentIndex + 1) % slides.length;
    updateGallery();
  });

  prevBtn.addEventListener("click", function () {
    currentIndex = (currentIndex - 1 + slides.length) % slides.length;
    updateGallery();
  });

  function updateGallery() {
    const translateValue = -currentIndex * 100 + "%";
    imageContainer.style.transform = "translateX(" + translateValue + ")";
  }
});
