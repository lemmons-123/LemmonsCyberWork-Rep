document.addEventListener('DOMContentLoaded', () => {
    const terminalBody = document.body;

    // Typing effect function
    function typeText(element, text, speed = 50, callback) {
        let i = 0;
        element.innerHTML = "";
        const interval = setInterval(() => {
            if (i < text.length) {
                element.innerHTML += text.charAt(i);
                i++;
                // Auto scroll removed

            } else {
                clearInterval(interval);
                if (callback) callback();
            }
        }, speed);
    }

    // Boot sequence simulation
    const bootLines = [
        "Initializing kernel...",
        "Loading modules...",
        "Mounting file systems...",
        "Starting network services...",
        "Establishing secure connection...",
        "Access granted."
    ];

    const bootContainer = document.getElementById('boot-sequence');
    const mainContent = document.getElementById('main-content');

    if (bootContainer) {
        let lineIndex = 0;

        function showBootLine() {
            if (lineIndex < bootLines.length) {
                const p = document.createElement('p');
                p.className = 'text-green-500 font-mono text-sm mb-1';
                p.textContent = `[OK] ${bootLines[lineIndex]}`;
                bootContainer.appendChild(p);
                lineIndex++;
                setTimeout(showBootLine, 300);
            } else {
                setTimeout(() => {
                    bootContainer.style.display = 'none';
                    mainContent.classList.remove('hidden');
                    mainContent.classList.add('animate__animated', 'animate__fadeIn');
                    initTypewriter();
                }, 800);
            }
        }

        showBootLine();
    } else {
        // If no boot container, just init
        initTypewriter();
    }

    function initTypewriter() {
        const heroText = "Welcome, I'm Caleb Lemmons.";
        const heroElement = document.getElementById('hero-typing');
        if (heroElement) {
            typeText(heroElement, heroText, 100);
        }
    }

    // Add blinking cursor effect to all .cursor-target elements
    setInterval(() => {
        const cursors = document.querySelectorAll('.cursor-blink');
        cursors.forEach(c => {
            c.style.opacity = c.style.opacity === '0' ? '1' : '0';
        });
    }, 500);
});
