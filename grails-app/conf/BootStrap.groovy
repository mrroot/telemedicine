import admin.*


/**
 * Created on 20.11.2016.
 */
class BootStrap {
    def authenticateService

    def init = { servletContext ->
        def role = new Role(authority: 'ROLE_ADMIN', description: 'Admin role').save()
        def admin = new User(username: 'admin', userRealName: 'admin',
                passwd: authenticateService.encodePassword('56rfhg'),
                enabled: true, email: 'admin@servername')
        admin.addToAuthorities(role)
        admin.save()
    }
    def destroy = {
    }
}