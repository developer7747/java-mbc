
        $(function() {
            $('.side-trigger-link').click(function(e) {
                target_div = $($(this).attr('href'));

                $('.side-content').hide();
                $('.side-trigger').animate({'right': '-50px'},function() {
                    target_div.css({'right': '-300px'}).show().animate({'right': '0'}, 'slow');
                });

                e.preventDefault();
            });

            $('.closeme').click(function(e) {
                $(this).parent('.side-content').animate({'right': '-300px'}, function() {
                    $(this).hide();
                    $('.side-trigger').animate({'right': '0'});
                })

                e.preventDefault();
            });
        });



           /* $(window).on('resize', function(e) {
                window.setTimeout(function() {
                    document.title = 'Reloading...';
                    location.reload();
                }, 750);
            });*/
