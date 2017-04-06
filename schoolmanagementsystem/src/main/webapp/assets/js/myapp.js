$(function() {
	// Solving the active menu
	switch (menu) {
	case 'home':
$('#home').addClass('active');
		break;
	case 'Login':
		$('#login').addClass('active');
		break
	default:
		break;
	}
})