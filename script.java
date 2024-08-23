document.addEventListener('DOMContentLoaded', (event) => {
    // Effet de survol pour les liens de navigation
    const navLinks = document.querySelectorAll('nav ul li a');
    navLinks.forEach(link => {
        link.addEventListener('mouseover', () => {
            link.style.textShadow = '0 0 10px #ff00ff';
        });
        link.addEventListener('mouseout', () => {
            link.style.textShadow = 'none';
        });
    });

    // Animation du titre
    const title = document.querySelector('h1');
    setInterval(() => {
        title.style.textShadow = `0 0 ${Math.random() * 10 + 5}px #ff00ff`;
    }, 500);

    // Message de bienvenue
    const mainContent = document.querySelector('main');
    const welcomeMessage = document.createElement('p');
    welcomeMessage.textContent = 'Prêt à jouer ? Explorez notre site !';
    welcomeMessage.style.color = '#ff00ff';
    welcomeMessage.style.textAlign = 'center';
    welcomeMessage.style.fontSize = '1.2rem';
    mainContent.appendChild(welcomeMessage);
});
