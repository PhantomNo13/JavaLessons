const content1 = document.querySelector(".Content1");
const content2 = document.querySelector(".Content2");
const content3 = document.querySelector(".Content3");
const content4 = document.querySelector(".Content4");


document.querySelector("#Content1Button").addEventListener("click", () => {
    
    content2.style.transform = "translateX(-200vw)"
    content1.style.transform = "translateX(0vw)"
    content3.style.transform = "translateX(-200vw)"
    content4.style.transform = "translateX(-200vw)"

})
document.querySelector("#Content2Button").addEventListener("click", () => {
    
    content2.style.transform = "translateX(0vw)"
    content1.style.transform = "translateX(-200vw)"
    content3.style.transform = "translateX(-200vw)"
    content4.style.transform = "translateX(-200vw)"

})
document.querySelector("#Content3Button").addEventListener("click", () => {
    
    content2.style.transform = "translateX(-200vw)"
    content1.style.transform = "translateX(-200vw)"
    content3.style.transform = "translateX(0vw)"
    content4.style.transform = "translateX(-200vw)"

})
document.querySelector("#Content4Button").addEventListener("click", () => {
   
    content2.style.transform = "translateX(-200vw)"
    content1.style.transform = "translateX(-200vw)"
    content3.style.transform = "translateX(-200vw)"
    content4.style.transform = "translateX(0vw)"

})

